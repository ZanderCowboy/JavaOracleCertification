package academy.learnprogramming;

/**
 * Constructor Definition Rules
 *
 * 1. The first statement of every constructor is a call to another constructor within the same class using this(),
 * or a call to parent class constructor using super().
 *
 * 2. If super() call is NOT declared in a constructor compiler will insert no argument super() as the first statement
 * of the constructor.
 *
 * 3. The super() call can't be used after the first statement of the constructor.
 *
 * 4. If the parent class does not have no-argument constructor and the child does not define ant constructors, compiler
 * will show error and try to insert a default no-argument constructor into the child class.
 *
 * 5. If the parent does not have a no-argument constructor, the compiler requires an explicit call to a parent
 * constructor in each child class.
 */

/**
 * Abstract Class Definition Rules
 * 1. Abstract classes can not be instantiated directly
 * 2. Abstract classes can have 0 to many abstract methods
 * 3. Abstract classes cannot be private or final
 * 4. Abstract class that extends another abstract class inherits all of its abstract methods as its ows
 * abstract methods
 * 5. The first concrete class that extends an abstract class must provide implementation for all of the
 * inherited abstract methods
 */

/**
 * Abstract Method Definition Rules
 * 1. Abstract method can only be defined in abstract classes.
 * 2. Abstract method can not be declared private or final
 * 3. Abstract methods must not provide a method body/implementation in the abstract class is which it is declared
 * 4. Implementing abstract method in subclass follows the same rules for overriding a method,
 * e.g. method signature must be the same and access modifier needs to be the same or higher
 */

/**
 * Default Interface Method Rules
 * 1. Default methods can only be creating in the interfaces and not within a class or abstract class
 * 2. Default method must be marked with default keyword and provide default implementation (needs to have body)
 * 3. Default method is not assumed to be static final or abstract as it may be used or overriden in classes
 * that implement the interface
 * 4. Default method is assuming to be public, and it will not compile if marked as private or protected
 */

/**
 * Interface Static Method Rules
 * 1. Static method is interfaces is assumed to be public and will not compile if marked as private/protected.
 * 2. To reference static method, a reference to the name of the interface must be used.
 */

public class ClassInheritancePart1 {
    public static void main(String[] args) {
        System.out.println("Run Main.java");
    }
}
