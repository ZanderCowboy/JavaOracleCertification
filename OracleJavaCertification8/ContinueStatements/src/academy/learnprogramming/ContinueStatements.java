package academy.learnprogramming;

/**
 * ADVANCED CONTROL FLOW USAGE
 *          Optional Labels     Break       Continue
 * if           yes             no          no
 * while        yes             yes         yes
 * do while     yes             yes         yes
 * for          yes             yes         yes
 * switch       yes             yes         no
 *
 */

public class ContinueStatements {
    public static void main(String[] args) {
        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

//        for (String animal : animals){
//            System.out.println(animal);
//        }

        MY_LOOP:
        for (String animal : animals) {
            if (animal.equals("Cat")){
                continue MY_LOOP; // skips rest of block and goes back to start of loop, MY_LOOP
            }
            System.out.println(animal);
        }
        System.out.println();

        // confusing
        animal:
        for (String animal : animals){
            if (animal.equals("Cat")){
                continue animal;
            }
            System.out.println(animal);
        }
        System.out.println();

        // "Dog", "Cat", "Lizard", "Bird", "Snake"
        for (String animal : animals) {
            if (animal.equals("Lizard") || animal.equals("Cat")){
                continue;
            }
            System.out.println(animal);
        }
        System.out.println();

        int index = 0;
        while (index < animals.length){
            String animal = animals[index];
            index++; // pay attention, where this is placed with continue statement

            if (animal.equals("Lizard")){
                continue;
            }
            System.out.println(animal);
//            System.out.println(index);
        }






    }
}
