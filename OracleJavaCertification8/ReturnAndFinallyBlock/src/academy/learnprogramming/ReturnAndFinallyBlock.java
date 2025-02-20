package academy.learnprogramming;

public class ReturnAndFinallyBlock {
    public static void main(String[] args) {
        System.out.println(calculate());

    }
     public static int calculate() {
        try {
//            System.exit(0);
            return 10 / 1;
        } catch (ArithmeticException e) {
            System.out.println("error");
            System.exit(0);
            return 1;
        } finally {
            System.out.println("finally");
            return 0;
        }
     }

}
