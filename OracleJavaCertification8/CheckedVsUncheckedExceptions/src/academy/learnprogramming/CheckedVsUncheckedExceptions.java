package academy.learnprogramming;

/**
 * java.lang.Object <- java.lang.Throwable <- java.lang.Error
 *                                         <- java.lang.Exception <- java.lang.RuntimeException (when you are running the code)
 *
 * Types of Exceptions
 *      TYPE                RECOGNIZING                     OK to CATCH?        Required to handle/declare
 * Unchecked Exception      Subclass of RuntimeException    Yes                 No
 * Checked Exception        Subclass of Exception           Yes                 Yes
 *                          but NOT subclass of
 *                          RuntimeException
 * Error                    Subclass of Error               No                  No
 *
 */

public class CheckedVsUncheckedExceptions {

    public static void main(String[] args) throws Exception {
        myMethod();
//        anotherMethod();

    }

    public static void myMethod() throws Exception { // Checked Exception
        throw new Exception("Failed to load");
    }

    public static void anotherMethod() throws RuntimeException{ // Unchecked Exception
        throw new RuntimeException("Wrong parameter");
    }
}
