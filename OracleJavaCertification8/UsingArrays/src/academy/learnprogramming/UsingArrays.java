package academy.learnprogramming;

import java.util.Arrays;

public class UsingArrays {
    public static void main(String[] args) {
        String[] pets = {"parrot", "cat", "dog"};

        System.out.println(pets[0]);
        System.out.println(pets[1]);
        System.out.println(pets[2]);
//        System.out.println(pets[3]); // throws ArrayIndexOutOfBounds since we only have 3 elements

        //
        pets[0] = "bird";

        // range of index [0-2], 0 - length - 1
        for (int i = 0; i < pets.length; i++){
            System.out.println(pets[i]);
        }
        for (int i = 0; i <= pets.length - 1; i++){
            System.out.println(pets[i]);
        }

        System.out.println(pets);
        System.out.println(Arrays.toString(pets));

        //
        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));

        String[] newPets = new String[5];
        System.out.println(Arrays.toString(newPets));

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 10;
        }

        for (int i = 0; i < numbers.length; i++){
            System.out.println("numbers[" + (i+1) + "]= " + numbers[i]);
        }

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        // Wrappers
        Integer[] nums = new Integer[4];
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++){
            nums[i] = i % 3;
        }

        System.out.println(Arrays.toString(nums));


    }
}
