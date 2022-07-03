package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        printOddNumbers();
        printTaskSeparator();

        printEvenNumbers();
        printTaskSeparator();

        printWords();
        printTaskSeparator();

        printNumberOfRepeat();
        printTaskSeparator();



    }

    public static void printOddNumbers () {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer i : nums) {
            if(i%2==1) {
                System.out.println(i);
            }
        }
    }

    public static void printEvenNumbers () {
        List<Integer> nums = new ArrayList<>(List.of(8, 1, 4, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> setOfNumbers = new HashSet<>();
        for (Integer i: nums) {
            if (i%2 == 0) {
               setOfNumbers.add(i);
            }
        }
        System.out.println(setOfNumbers);
        for (Integer i:setOfNumbers) {
            System.out.println(i);
        }
    }

    public static void printWords() {
        List<String> words = List.of("cat", "dog", "house", "cat", "task", "house", "task" );
        Set<String> uniqueWords = new HashSet<>();
        for (String i:words) {
            uniqueWords.add(i);
        }
        System.out.println(uniqueWords);
    }

    public static void printNumberOfRepeat () {
        List<String> words = List.of("cat", "dog", "house", "cat", "task", "house", "task", "task" );
        Map<String, Integer> repeatCounter = new HashMap<>();
        for (String i :words) {
            if (repeatCounter.containsKey(i)) {
                repeatCounter.put(i, repeatCounter.get(i)+1);
            } else {
                repeatCounter.put(i, 1);
            }
        }
        System.out.println(repeatCounter);

    }

    public static void printTaskSeparator(){
        System.out.println("===================");
    }
}
