package academy.learnprogramming;

class MuseumClosed extends RuntimeException {}

class MuseumClosedForLunch extends MuseumClosed {}

public class CatchingDifferentExceptions {
    public static void main(String[] args) {
        try {
            visitMuseum();
        }
//        catch (RuntimeException e) { // superclass, will handle all exceptions including subclass exceptions
//            System.out.println("Runtime Exception");
//        }
        catch (MuseumClosedForLunch e) { // subclass, needs to come first to ensure that the subclass can handle exceptions
            System.out.println("Closed for lunch, come back in 2 hours");
        }
        catch (MuseumClosed e) { // superclass
            System.out.println("Closed");
        }
        // does not compile since the first catch will handle both
//        catch (MuseumClosedForLunch e) { // subclass
//            System.out.println("Closed for lunch, come back in 2 hours");
//        }

        System.out.println(calculate());

    }

    public static String calculate() {
        String result = "";
        String str = null;

        try {
            try {
                result += "start"; // result=start
                str.length(); // throws NullPointerException
                result += "end";
            } catch (NullPointerException e) {
                result += "npe"; // result= startnpe
                throw new RuntimeException();
            } finally {
                result += "finally"; // result= startnpefinally
                throw new Exception();
            }
        } catch (Exception e) {
            result += "finished"; // result= startnpefinallyfinished
        }

        return result;
    }

    public static void visitMuseum() {
        boolean b = Math.random() < 0.5;

        if (b) throw new MuseumClosed();

        throw new MuseumClosedForLunch();
    }


}
