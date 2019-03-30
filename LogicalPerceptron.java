import java.lang.reflect.Array;

public class LogicalPerceptron {
    private double weight[];
    private String logic; // AND, OR, NODEFINED

    public LogicalPerceptron(){
        this.weight = new double[3];
        for( int i = 0; i<=2;i++){
            this.weight[i] = Math.random();
        }
        this.logic = "NODEFINED";
    }

    public int do_it(int enters[]){
        double mass = 0;//1 * weight[2];
        for(int i = 0; i <= 1; i++){
            mass = mass + weight[i] * enters[i];
        }
        if(mass > 0){
            return 1;
        } else {
            return -1;
        }
    }

    public void setLogic(String newLogic) {
        int exampels[][]= null;
        if (newLogic.equals(this.logic)) {
            return;
        } else{
            this.logic = newLogic;
            switch (newLogic) {
                case "AND":
                     exampels = new int[][] {{1,1,1},
                                             {1,-1,-1},
                                             {-1,1,-1},
                                             {-1,-1,-1}};

                    break;
                case "OR":
                     exampels = new int[][] {{1,1,1},
                                             {1,-1,1},
                                             {-1,1,1},
                                             {-1,-1,-1}};
                    break;
                case "NODEFINED":
                    for( int i = 0; i<=1;i++){ 
                        this.weight[i] = Math.random();
                    }
                    System.out.println("Весы сброшены");
                    return;

                default:
                    System.out.println("Ничего не сделано, не введён тип Перцептрона");
                    return;
            }
            studying(exampels);
        }
    }

    private void studying(int exampels[][]){
        boolean perfect = false;
        while (perfect != true){
            perfect = true;

            for(int p = 0; p <= 3; p++){
                int answer = this.do_it(java.util.Arrays.copyOf(exampels[p],exampels[p].length -1 ));
                if( answer != exampels[p][2]){
                    perfect = false;
                    for( int i = 0; i<=1;i++){
                        this.weight[i] += (exampels[p][2] - answer)* exampels[p][i];
                    }
                    this.weight[2] += (exampels[p][2] - answer);
                }
            }

        }
    }
}
