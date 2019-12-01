public class Main {
    public static void main(String[] args) {
        System.out.println("111111");
        //主分支summit

        System.out.println("v1.1.3");
    }

    public static int add(int a, int b) {
        Utils.log("add start");
        if (a == 0) {
            if (b == 0)
                return 0;
            else
                return b;
        }
        Utils.log("add end");
        return a + b;
    }
}
