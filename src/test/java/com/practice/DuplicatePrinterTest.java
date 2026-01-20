package com.practice;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class DuplicatePrinterTest {

    @Test
    void printsDuplicatesWhenPresent() {
        String output = runMainWithInput("apple banana apple apple banana\n");
        assertTrue(output.contains("Duplicates: apple banana"));
    }

    @Test
    void printsNoDuplicatesMessageWhenNone() {
        String output = runMainWithInput("one two three\n");
        assertTrue(output.contains("No duplicates found."));
    }

    private String runMainWithInput(String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
            System.setOut(new PrintStream(outputStream));
            DuplicatePrinter.main(new String[0]);
            return outputStream.toString(StandardCharsets.UTF_8);
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }
}
