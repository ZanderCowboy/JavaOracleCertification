package academy.learnprogramming;

public class UnaryOperator {

    public static void main(String[] args) {
        int x = +3; // + sign is redundant

        System.out.println("x = " + x);

        double y = -x;
        System.out.println("x = " + x + " y = " + y);

        y = -y; // -1 * y
//        y = -1 * y;
        System.out.println("x = " + x + " y = " + y);

        boolean a = true;
        boolean b = !a;

        System.out.println("a = " + a + " b = " + b);

        b = !b;
        System.out.println("a = " + a + " b = " + b);

//        int myInt = !5; // does not compile
//        boolean myBoolean = -true; // does not compile
//        boolean z = !0; // does not compile

        // increment and decrement be careful, have higher order than (+, -, *, /, ...)
        int myInt = 5;
//        myInt = myInt + 1;
//        int otherInt = myInt;
        int otherInt = ++myInt;
        System.out.println("myInt = " + myInt + " otherInt = " + otherInt);

        int newInt = 5;
//        int newOtherInt = newInt;
//        newInt = newInt + 1;
        int newOtherInt = newInt++;
        System.out.println("newInt = " + newInt + " newOtherInt = " + newOtherInt);

        int count = 0;
        System.out.println(count);
        System.out.println(++count); // 1
        System.out.println(count); // 1
        System.out.println(count--); // 1 but also set count to 0
        System.out.println(count); // 0

        // exam questions
        int e = 3;
        int f = ++e * 5 / e-- + --e;
        // f = 4 * 5 / 4 + 2
        // f = 20 / 4 + 2
        // f = 5 + 2
        // f = 7
        System.out.println("e = " + e + " f = " + f);

        //
        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
        // g = 6, h = 3
        // 3 + --g * 3 + 2 * g++ - h-- % --g
        // g = 5, h = 3
        // 3 + 5 * 3 + 2 * g++ - h-- % --g
        // 3 + 5 * 3 + 2 * 5 - h-- % --g
        // g = 6, h = 3
        // 3 + 15 + 2 * 5 - 3 % --g
        // g = 5, h = 2
        // 18 + 2 * 5 - 3 % 5
        // 18 + 10 - 3 % 5
        // 18 + 10 - 3
        // 28 - 3
        // 25

        System.out.println("g = " + g + " h = " + h + " i = " + i);

    }
}
