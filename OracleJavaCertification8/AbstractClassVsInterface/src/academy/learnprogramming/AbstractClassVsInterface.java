package academy.learnprogramming;

/**
 * Use Abstract Classes When:
 * a. You want to share code among several closely related classes (Animals - name, age...)
 * b. You expect that classes that extend your abstract class have many common methods of fields or required
 * access modifiers other than public (protected, private)
 * c. You want to declare non-static or non-final fields (name, age), this enables you to define methods that
 * can access and modify the state of object (getName, setName)
 *
 * Use Interfaces When:
 * a. You expect that unrelated classes would implement your interface
 * b. You want to specify the behaviour of a specific data type, but you are not concerned about who implements
 * its behaviour (Hop)
 * c. You want to separate different behaviour (Carnivore, Herbivore)
 */

public class AbstractClassVsInterface {
    public static void main(String[] args) {
        System.out.println();
    }
}
