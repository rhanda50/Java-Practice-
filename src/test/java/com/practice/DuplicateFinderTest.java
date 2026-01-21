package com.practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateFinderTest {

    // This method takes the raw input string and returns the set of duplicates
    public Set<Integer> findDuplicates(String input) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        if (input == null || input.isEmpty()) {
            return duplicates;
        }

        String[] parts = input.trim().split("\\s+");

        for (String part : parts) {
            try {
                int number = Integer.parseInt(part);
                // If add returns false, it's already in 'seen', so it's a duplicate
                if (!seen.add(number)) {
                    duplicates.add(number);
                }
            } catch (NumberFormatException e) {
                // Ignore non-integer parts
            }
        }
        return duplicates;
    }
}
