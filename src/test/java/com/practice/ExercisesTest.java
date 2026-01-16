package com.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExercisesTest {
    @Test
    void factorial_handlesZeroAndPositive() {
        Exercises exercises = new Exercises();
        assertEquals(1, exercises.factorial(0));
        assertEquals(120, exercises.factorial(5));
    }

    @Test
    void factorial_rejectsNegative() {
        Exercises exercises = new Exercises();
        assertThrows(IllegalArgumentException.class, () -> exercises.factorial(-1));
    }

    @Test
    void palindrome_ignoresSpacesAndCase() {
        Exercises exercises = new Exercises();
        assertTrue(exercises.isPalindrome("Never odd or even"));
        assertTrue(exercises.isPalindrome("RaceCar"));
        assertFalse(exercises.isPalindrome("hello"));
    }

    @Test
    void palindrome_nullIsFalse() {
        Exercises exercises = new Exercises();
        assertFalse(exercises.isPalindrome(null));
    }

    @Test
    void fizzBuzz_generatesSequence() {
        Exercises exercises = new Exercises();
        assertEquals(
                "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz",
                exercises.fizzBuzz(15)
        );
    }

    @Test
    void fizzBuzz_rejectsNonPositive() {
        Exercises exercises = new Exercises();
        assertThrows(IllegalArgumentException.class, () -> exercises.fizzBuzz(0));
    }

    @Test
    void sum_handlesNullAndValues() {
        Exercises exercises = new Exercises();
        assertEquals(0, exercises.sum(null));
        assertEquals(6, exercises.sum(new int[]{1, 2, 3}));
    }
}
