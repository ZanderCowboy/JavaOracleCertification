package academy.learnprogramming;

/**
 * Default Interface Method Rules
 * 1. Default methods can only be creating in the interfaces and not within a class or abstract class
 * 2. Default method must be marked with default keyword and provide default implementation (needs to have body)
 * 3. Default method is not assumed to be static final or abstract as it may be used or overriden in classes
 * that implement the interface
 * 4. Default method is assuming to be public, and it will not compile if marked as private or protected
 */

public class DefaultInterfaceMethods {
    public static void main(String[] args) {
        System.out.println("DefaultInterfaceMethods is explained in ClassInheritancePart1");
    }
}
