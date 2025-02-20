/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 8: Applying Encapsulation
Topic: Access Modifiers
Sub-Topic: Constructors
*/
package pkgTwo;

import pkgOne.LevelTwoClass;

// Extends class from a different package
class LevelThreeClass extends LevelTwoClass {

    // package-private constructor
    LevelThreeClass() {
        // 1
        this("good"); // this calls the one argument constructor in the current class
        // 1, 3
        System.out.println("package LevelThreeClass " +
                "no args constructor");
    }

    // private constructor
    private LevelThreeClass(String text) {
        // 2
        super();
        // 2, 2
        System.out.println("private LevelThreeClass " +
                "single params constructor");
    }
}

public class ConstructorAccess {
    public static void main(String[] args) {
        // The constructor test
        LevelThreeClass c = new LevelThreeClass(); // 0, 4

    }
}