package com.practice;
import java.util.Map;

public class DuplicatePrinter {
    public static void main(String[] args) {

        Exercises exercises = new Exercises();
        Map<Integer, Integer> duplicates = exercises.duplicatesOnly();

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");

        } else {
            System.out.println("Duplicate numbers and their counts:");
            for (Map.Entry<Integer, Integer> entry : duplicates.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");

            }
        }
    }
}

