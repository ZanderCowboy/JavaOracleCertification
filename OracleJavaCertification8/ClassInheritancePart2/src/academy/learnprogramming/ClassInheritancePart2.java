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

public class ClassInheritancePart2 {
    public static void main(String[] args) {
        System.out.println("Class Inheritance Part 2 is in Part 1");
    }
}
