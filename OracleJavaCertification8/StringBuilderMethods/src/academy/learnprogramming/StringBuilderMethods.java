package academy.learnprogramming;

public class StringBuilderMethods {
    public static void main(String[] args) {
        // charAt, indexOf, length, substring
        // 0 1 2 3 4 5 6 7 8 9 10
        // p r o g r a m m i n g
        StringBuilder sb = new StringBuilder("programming");

//        int a = sb.indexOf("g");
//        int b = sb.indexOf("mi");
//        String sub = sb.substring(a, b);
        String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi")); // gram
        int len = sb.length(); // 11
        char ch = sb.charAt(5); // a

        System.out.println(sub + " " + len + " " + ch);

        // append
        StringBuilder b = new StringBuilder().append(1).append('L');
        b.append("-").append(true);
        System.out.println(b);

        // insert (insert as given position)
        StringBuilder builder = new StringBuilder("programming");
        builder.insert(7, '-');
        builder.insert(2, 2);
        // 0 1 2 3 4 5 6 7 8 9 10 11 12
        // p r 2 o g r a m - m  i  n  g
        System.out.println(builder);
//        System.out.println(builder.indexOf("g", 8));

        // delete, deleteCharAt
        builder.delete(4, 9);
        // 0 1 2 3 4 5 6 7
        // p r 2 o m i n g
        System.out.println(builder);
        builder.deleteCharAt(2);
        System.out.println(builder);

//        builder.delete(2, 1); // does not compile
        builder.delete(1, 1); // does not change anything
        System.out.println(builder);

        // reverse
        StringBuilder sb1 = new StringBuilder("ABC123");
        sb1.reverse();
        System.out.println(sb1);

        // toString
        String myString = sb1.toString().toLowerCase();
//        myString = myString.toLowerCase();
        System.out.println(myString);




    }
}
