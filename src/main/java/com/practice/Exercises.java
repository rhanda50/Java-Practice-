package com.practice;

import java.util.Locale;

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
}
