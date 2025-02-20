package academy.learnprogramming;

/**
 * Order of Initialization
 * 1. If there is a superclass, initialize it first
 * 2. Static variable declarations and static initializers in order they appear in the file
 * 3. Instance variable declarations and instance initializers in order they appear in the file
 * 4. The constructor
 */

class Example {
    // step 3.1
    private String name = "dog";
    {
        System.out.println(name);
    }

    // step 2
    private static int COUNT = 0;
    static {
        System.out.println(COUNT);
    }

    // step 3.2
    {
        COUNT += 10;
        System.out.println(COUNT);
    }

    // step 4
    public Example() {
        System.out.println("constructor");
    }
}

class Demo {
    static { // 1
        add(2);
    }

    static void add(int number) {
        System.out.print(number + " ");
    }

    Demo() { // 6, 10
        add(5);
    }

    static { // 2
        add(4);
    }

    { // 4, 8
        add(6);
    }

    static { //3
        // static is done.
        // before new Demo(); can be executed, instance variables need to be executed
        new Demo(); // after step 5, constructor can be executed
    }

    { // 5, 9
        add(8);
    }
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        new Example();

        new Demo(); // only after steps 1-6, can this step 7 be executed.

    }
}
