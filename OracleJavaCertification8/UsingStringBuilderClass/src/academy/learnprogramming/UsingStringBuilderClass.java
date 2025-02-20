package academy.learnprogramming;

public class UsingStringBuilderClass {
    public static void main(String[] args) {
        String myString = "";

        for (char c = 'a'; c <= 'z'; c++){
            myString += c; // every iteration this will create new String object
        }
        System.out.println(myString);

        // with String Builder
        // StringBuilder is mutable
        StringBuilder sb = new StringBuilder(); // create new instance of StringBuilder object

        for (char c = 'a'; c <= 'z'; c++){
            sb.append(c); // add char to string builder, reuses string builder without creating string each time
        }

        System.out.println(sb);

        //
        StringBuilder builder = new StringBuilder("start"); // constructor
        builder.append("-middle"); // "start-middle"
        StringBuilder anotherBuilder = builder.append("-end");

        System.out.println(builder);
        System.out.println(anotherBuilder);

        System.out.println(builder == anotherBuilder);
        System.out.println(System.identityHashCode(builder));
        System.out.println(System.identityHashCode(anotherBuilder));
        System.out.println();

        //
        StringBuilder myBuilder = new StringBuilder();
        System.out.println("size= " + myBuilder.length());
        System.out.println("capacity= " + myBuilder.capacity());

        myBuilder = new StringBuilder(100);
        System.out.println("size= " + myBuilder.length());
        System.out.println("capacity= " + myBuilder.capacity());

        myBuilder.append("MyNewTest");
        System.out.println("size= " + myBuilder.length());
        System.out.println("capacity= " + myBuilder.capacity());

//        myBuilder.append(" Add another string");
//        System.out.println("size= " + myBuilder.length());
//        System.out.println("capacity= " + myBuilder.capacity());

        // PAY ATTENTION
        // a is a new StringBuilder and b is just another StringBuilder, not a new one!!
        StringBuilder a = new StringBuilder("This ");
//        System.out.println(a.append("Java "));
        StringBuilder b = a.append("Java "); // here we let b point to a, thus they have the same values
//        System.out.println(a);
//        System.out.println(b);
        b = b.append("is").append(" so ").append("Cool");
        System.out.println(a);
        System.out.println(b);







    }
}
