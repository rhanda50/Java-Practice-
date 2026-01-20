package com.practice;

import java.util.Scanner;

public class DuplicatePrinter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter values separated by spaces, then press Enter:");
            String input = scanner.nextLine();

            Exercises exercises = new Exercises();
            String duplicates = exercises.duplicatesOnly(input);

            if (duplicates.isEmpty()) {
                System.out.println("No duplicates found.");
            } else {
                System.out.println("Duplicates: " + duplicates);
            }
        }
    }
}
