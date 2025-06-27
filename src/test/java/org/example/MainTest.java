package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void reverseString_shouldReturnollaH_whenCalledWithHallo() {
        String result = Main.reverseString("Hallo");
        assertEquals("ollaH", result);
    }

    @Test
    void sortArray_shouldReturnsSortedArray_whenCalledWithIntArray() {
        int[] input = {6, 2, 8, 3, 9, 6};
        int[] expected = {2, 3, 6, 6, 8, 9};

        int[] actual = Main.sortArray(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    void stringToArray_shouldReturnArray_whenCalledWithString() {
        String input = "eins,zwei,drei,vier,fünf";
        String[] expected = {"eins", "zwei", "drei","vier", "fünf"};

        String[] actual = Main.stringToArray(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    void quersumme_shouldReturn12_whenCalledWith732() {
        int input=732;
        int expected=12;
        int actual=Main.quersumme(input);
        assertEquals(expected,actual);
    }

    @Test
    void romanNumber_shouldReturnLXXIV_whenCalledWith74() {
        int input=74;
        String expected="LXXIV";

        assertEquals(expected,Main.romanNumber(input));
    }
}
