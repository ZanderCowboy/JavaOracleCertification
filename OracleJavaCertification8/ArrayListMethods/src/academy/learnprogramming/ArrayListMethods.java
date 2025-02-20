package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
//        List list = new ArrayList(); // same as below, with objects type
        List<Object> list = new ArrayList<>(); // same as above

        list.add("dog");
        list.add(5);
        System.out.println(list);

        List<String> pets = new ArrayList<>();
        pets.add("dog");
        System.out.println(pets);

        pets.add(0, "cat");
        System.out.println(pets);

//        pets.add(5);
        // 0    1
        // cat, dog
        pets.add(1, "parrot"); // cat, parrot, dog
        pets.add(0, "husky"); // husky, cat, parrot, dog
        pets.add(1, "bird"); // husky, bird, cat, parrot, dog
        System.out.println(pets);

        // remove
        pets.remove("parrot"); // husky, bird, cat, dog
        System.out.println(pets);

        pets.remove(2); // husky, bird, dog
        System.out.println(pets);

        // set
//        pets[0] = "newBird";
        pets.set(0, "newBird"); // newBird, bird, dog
        System.out.println(pets);

//        pets.set(6, "myDog");

        System.out.println();

        pets.remove(0);
        pets.remove(0);
        pets.remove(0);

        // ARRAY LIST METHODS 2

        // isEmpty, size
        System.out.println(pets.isEmpty());
        System.out.println(pets.size());

        if (pets.isEmpty()){
            System.out.println("no pets");
        }
        if (pets.size() == 0)
            System.out.println("no pets");

        pets.add("cat");
        System.out.println(pets.isEmpty());
        System.out.println(pets.size());

        // clear
        pets.clear();
        System.out.println(pets.isEmpty());
        System.out.println(pets.size());

        // contains
        pets.add("dog");
        System.out.println(pets.contains("cat")); // false
        System.out.println(pets.contains("dog")); // true

        List<String> newPets = new ArrayList<>();
        newPets.add("dog");

        // equals
        System.out.println(pets.equals(newPets));

        newPets.add("cat");
        System.out.println(pets.equals(newPets));

        pets.add(0, "cat");
        System.out.println(pets);
        System.out.println(newPets);

        // size and elements are equal but order of elements is not equal
        System.out.println(pets.equals(newPets));


        
    }
}
