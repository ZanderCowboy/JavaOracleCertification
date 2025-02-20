package academy.learnprogramming;

public class UnderstandingEquality {
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("Java");

        System.out.println(one == two); // false
        System.out.println(one == three); // true

        //
        String x = "Java";
        String y = "Java";
        System.out.println(x == y); // true

        //
        String a = "Java";
        String b = " Java".trim(); // trim creates a new String
//        String b1 = b.trim();
        System.out.println(a == b); // false
//        System.out.println(System.identityHashCode(a));
//        System.out.println(System.identityHashCode(b));
//        System.out.println(System.identityHashCode(b1));

        //
        String c = "Java";
        String d = " Ja".trim() + "va";
        System.out.println(c == d);



    }
}
