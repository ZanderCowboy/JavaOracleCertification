package academy.learnprogramming;

import java.util.Arrays;

/**
 * SCENARIO         RESULT
 * Element Found - Sorted Array     Index of element that was found
 * Element not Found - Sorted       Negative value, showing 1 smaller than the negative of index,
 *                                  where a match needs to be inserted to preserve sorted order
 * Unsorted Array                   Result not Predictable
 */

public class SearchingArrays {
    public static void main(String[] args) {
        // Binary search requires a sorted list
        // Splits arrays in two

        // sorted array
        // 0 1 2 3 4
        // 1 3 5 6 7
        int[] numbers = {1, 3, 5, 6, 7};

        System.out.println(Arrays.binarySearch(numbers, 2)); // since not in array, it is [negative(index where it would have been)-1] : -2
        System.out.println(Arrays.binarySearch(numbers, 5)); // 2
        System.out.println(Arrays.binarySearch(numbers, 7)); // 4
        System.out.println(Arrays.binarySearch(numbers, 1)); // 0
        System.out.println(Arrays.binarySearch(numbers, 3)); // 1
        System.out.println(Arrays.binarySearch(numbers, 6)); // 3
        System.out.println(Arrays.binarySearch(numbers, 4)); // -3: [-(2)-1] -> [-3]
        System.out.println(Arrays.binarySearch(numbers, 20)); // -6: [-(5)-1] -> [-6]

        // unsorted array
        int[] notSortedNumbers = {5, 4, 10, 8, 6};
//        Arrays.sort(notSortedNumbers);
        System.out.println(Arrays.toString(notSortedNumbers));
        System.out.println(Arrays.binarySearch(notSortedNumbers, 5));
        System.out.println(Arrays.binarySearch(notSortedNumbers, 8));



    }
}
