package academy.learnprogramming;

import java.util.Arrays;

public class NestedLoops {
    public static void main(String[] args) {
        for (int hours = 1; hours <= 6; hours++){
            for (int minutes = 0; minutes < 60; minutes++){
//                System.out.println(hours + ":" + minutes);
            }
        }
        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(myArray);
        System.out.println(Arrays.toString(myArray));

        OUTER:
        for (int[] rowArray : myArray){
            INNER:
            for (int i = 0; i < rowArray.length; i++){
                if (rowArray[i] % 2 == 0){
//                    break INNER;
//                    break OUTER;
//                    continue INNER; // will continue to line 23
//                    continue OUTER; // will continue to line 21
                }
                System.out.print(rowArray[i] + " ");
            }
            System.out.println();
        }

        int x = 10;
        while (x > 0){
            do {
                x -= 1;
            } while (x > 5);
            x--;

            // prints 4
            // prints 2
            // prints 0
            System.out.println(x);
        }


    }
}
