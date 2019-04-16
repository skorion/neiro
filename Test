public class Test {
    public static void main(String args[]){
        LogicalPerceptron Per = new LogicalPerceptron();
        Per.setLogic("OR");
        int[] e = {1,1};
        System.out.println(Per.do_it(e));
        e = new int[] {-1,1};
        System.out.println(Per.do_it(e));
        e = new int[] {1,-1};
        System.out.println(Per.do_it(e));
        e = new int[] {-1,-1};
        System.out.println(Per.do_it(e));
        
        Per.setLogic("NODEFINED");
        
        Per.setLogic("AND");
        e = new int[] {1,1};
        System.out.println(Per.do_it(e));
        e = new int[] {-1,1};
        System.out.println(Per.do_it(e));
        e = new int[] {1,-1};
        System.out.println(Per.do_it(e));
        e = new int[] {-1,-1};
        System.out.println(Per.do_it(e));
    }
}
