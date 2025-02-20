package academy.learnprogramming;

import java.util.*;

public class IteratingList {
    public static void main(String[] args) {
//        IteratingListPart1();

        // * * * Iterating LIST Part 2 * * *
        List<String> list = Arrays.asList(createArray());


        // for loop
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++){
            String temp = list.get(i);
        }
        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("for loop totalTime= " + totalTime + " ms");


        // for each loop
        startTime = System.currentTimeMillis();

//        String str;
//        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); str = iterator.next()){
//            // blank
//        }

        for (String temp : list) {
            // blank
        }
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("for each loop totalTime= " + totalTime + " ms");

        // iterator
        startTime = System.currentTimeMillis();
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ){
            String temp = iterator.next();
        }
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("iterator totalTime= " + totalTime + " ms");

        // listIterator
        startTime = System.currentTimeMillis();
        for (ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext(); ){
            String temp = listIterator.next();
        }
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("listIterator totalTime= " + totalTime + " ms");

    }

    private static void IteratingListPart1(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        for (int i = 0; i < numbers.size(); i++){
            System.out.println("element at index " + i + " is " + numbers.get(i));
//            numbers.remove(2); // index out of bounds
        }

        for (Integer number : numbers) {
            System.out.println("number= " + number);
//            numbers.remove(2); // concurrent modification
        }

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ){
            Integer number = iterator.next();
            System.out.println(number);
            iterator.remove();
        }
        System.out.println(numbers);

        // ListIterator is more advanced than Iterator

        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        for (ListIterator<Integer> listIterator = numbers.listIterator(3); listIterator.hasPrevious(); ){
            System.out.println(listIterator.previous());
            listIterator.remove();
        }
        System.out.println(numbers);
    }

    private static String[] createArray(){
        String[] stringArray = new String[10_000_000];

        System.out.println("running...");

        for (int i = 0; i < stringArray.length; i++){
            stringArray[i] = "Array " + i;
        }
        return stringArray;
    }
}
