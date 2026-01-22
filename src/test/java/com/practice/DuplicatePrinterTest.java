package com.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class DuplicatePrinterTest {

    private final java.io.InputStream originalIn = System.in;

    @AfterEach
    void restoreSystemIn() {
        System.setIn(originalIn);
    }

    @Test
    void shouldReturnDuplicatesWhenDuplicatesExist() {
        // n = 6, values = 1 2 3 2 1 2
        String input = "6\n1 2 3 2 1 2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Exercises exercises = new Exercises();
        Map<Integer, Integer> result = exercises.duplicatesOnly();

        assertEquals(2, result.size());
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }

    @Test
    void shouldReturnEmptyMapWhenNoDuplicates() {
        // n = 5, values = 1 2 3 4 5
        String input = "5\n1 2 3 4 5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Exercises exercises = new Exercises();
        Map<Integer, Integer> result = exercises.duplicatesOnly();

        assertTrue(result.isEmpty());
    }

    @Test
    void shouldHandleAllSameNumbers() {
        // n = 4, values = 7 7 7 7
        String input = "4\n7 7 7 7\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Exercises exercises = new Exercises();
        Map<Integer, Integer> result = exercises.duplicatesOnly();

        assertEquals(1, result.size());
        assertEquals(4, result.get(7));
    }

    @Test
    void shouldHandleSingleElement() {
        // n = 1, values = 10
        String input = "1\n10\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Exercises exercises = new Exercises();
        Map<Integer, Integer> result = exercises.duplicatesOnly();

        assertTrue(result.isEmpty());
    }
}
