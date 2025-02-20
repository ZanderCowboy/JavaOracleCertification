package academy.learnprogramming;

public class ConditionalOperators {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = a && b; // false
        boolean e = a || b; // true

        System.out.println("d = " + d + " e = " + e);

        int f = 4;
        boolean g = false && (f++ < 4); // (f++ < 4) is never executed (short-circuiting)
        boolean h = (f-- == 4) && !g; // true && !g, f=3
        // true && true -> true

        System.out.println("f = " + f + "\ng = " + g + "\nh = " + h);

        int myInt = 3;
        int anotherInt = 4;
        boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);
        // (3 <= 3) && (4-- == 4) || (3++ == 4)
        // true && true || (3++ == 4)
        // true || (3++ == 4) -> since OR has already one operand that is true, the second part isn't executed
        // true
        // myInt = 3, anotherInt = 3

        System.out.println("myInt = " + myInt); // 3
        System.out.println("anotherInt = " + anotherInt); // 3
        System.out.println("myBoolean = " + myBoolean); // true

        boolean x = true, z = false;
        int y = 20;
        x = (y != 10) ^ (z = false);
        // (20 != 10) ^ false
        // true ^ false
        // true


        System.out.println(x + ", " + y + ", " + z); // true, 20, false


    }
}
