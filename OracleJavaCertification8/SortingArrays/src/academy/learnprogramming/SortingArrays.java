package academy.learnprogramming;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 2};

        Arrays.sort(numbers);
        for (int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] strings = {"50", "9", "500"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));


    }
}
