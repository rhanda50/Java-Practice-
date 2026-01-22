package com.practice;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.Map;


public class Exercises {
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String normalized = input.replaceAll("\\s+", "").toLowerCase(Locale.ROOT);
        int left = 0;
        int right = normalized.length() - 1;
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public String fizzBuzz(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                sb.append(' ');
            }
            if (i % 15 == 0) {
                sb.append("FizzBuzz");
            } else if (i % 3 == 0) {
                sb.append("Fizz");
            } else if (i % 5 == 0) {
                sb.append("Buzz");
            } else {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public int sum(int[] values) {
        if (values == null) {
            return 0;
        }
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
    public Map<Integer, Integer> duplicatesOnly() {

        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> countMap = new HashMap<>();

        // Read n
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        // Read n integer values
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Store only duplicates
        Map<Integer, Integer> duplicates = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.put(entry.getKey(), entry.getValue());
            }
        }


        return duplicates;
        //return Map.of(1, 1);
    }

}
