/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 11: Handling Exception
Topic:  Describe Exception Handling and types of exceptions
Sub-Topic:  Catch Examples
*/

import java.io.IOException;

class CustomThrowable extends Throwable {
    CustomThrowable(String message) {
        super(message);
    }
}

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

class SuperClass {
    public void methodSuperClass() throws CustomException { // 3. Throwing an CustomException error

    }
}

class SubClass extends SuperClass {
    public void methodSubClass() {
        try {
            methodSuperClass(); // 2. Which in turn calls methodSuperClass in SuperClass
        } catch (Exception CustomException) { // 4. Caught here and not in try/catch block at 1.
            // ignore it
        }
    }
}

public class CatchExamples {
    public static void main(String[] args) {
        CatchExamples ce = new CatchExamples();

        // Reminder, Throwable or custom subclasses of Throwable and any
        // RuntimeException descendants are checked.

//        try {
////            throw new CustomThrowable("Error testy");
//        } catch (CustomThrowable e) {
//
//        }
//        //----------------------------
//        try {
//            SubClass c = new SubClass();
////            c.methodSuperClass();
//            c.methodSubClass(); // 1. this call methodSubClass()
//
//        } catch (CustomException e) {
//
//        }
//        //----------------------------
//        try {
//
//        } catch (Error e) {
//
//        }
//        //----------------------------
//        try {
//
//        } catch (RuntimeException e) {
//
//        }

//        try {
//            SubClass c = new SubClass();
//            c.methodSuperClass();
//            ce.testError(); // needed for IOException below
//
//        } catch (CustomException | RuntimeException | IOException e) {
////            e = new CustomException("So many exceptions, so little time");
//            throw new RuntimeException("So many exceptions, so little time");
//        }


        try {
            SubClass c = new SubClass();
            c.methodSuperClass();
            ce.testError();

        } catch (ArithmeticException e) {
            e = new ArithmeticException("This works");
            throw e;
        }
        catch (CustomException | RuntimeException | IOException e) {
            throw new RuntimeException("So many exceptions, so little time");
        }


    }

    private void testError() throws IOException {
        // We'll complete this later
    }
}