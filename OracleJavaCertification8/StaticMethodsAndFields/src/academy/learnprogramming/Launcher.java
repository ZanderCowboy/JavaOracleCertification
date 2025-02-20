package academy.learnprogramming;

public class Launcher {

    public static void main(String[] args) {
        StaticMethodsAndFields.main(args); // calling main in class StaticMethodsAndFields
        System.out.println(StaticMethodsAndFields.myNumber);

        AnotherMain.main(args); // calling main in class AnotherMain
    }
}
