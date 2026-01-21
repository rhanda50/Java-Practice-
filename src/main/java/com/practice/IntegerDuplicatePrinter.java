package com.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntegerDuplicatePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers separated by spaces:");
        System.out.println("(e.g., 10 5 10 2 5)");

        // 1. Read the entire line of input
        String inputLine = scanner.nextLine();

        // 2. Split into parts based on whitespace
        String[] numberStrings = inputLine.split("\\s+");

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        System.out.print("Duplicate integers found: ");
        boolean foundAny = false;

        // 3. Loop through strings, parse to int, and check
        for (String numStr : numberStrings) {
            try {
                int number = Integer.parseInt(numStr);

                // !seen.add(number) returns true if the number was ALREADY in the set
                if (!seen.add(number)) {
                    // We also check if we've already added it to 'duplicates'
                    // so we don't print "10" twice if the input is "10 10 10"
                    if (duplicates.add(number)) {
                        System.out.print(number + " ");
                        foundAny = true;
                    }
                }
            } catch (NumberFormatException e) {
                // Determine how to handle non-integers (skip them or warn user)
                System.out.println("\n[Skipping invalid input: " + numStr + "]");
            }
        }

        if (!foundAny) {
            System.out.print("None");
        }

        System.out.println(); // New line for clean formatting
        scanner.close();
    }
}
