package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void romanNumber_shouldReturnIII_whenCalledWith3() {
        int input=3;
        String expected="III";

        assertEquals(expected,Main.romanNumber(input));
    }

    void romanNumber_shouldReturnC_whenCalledWith100() {
        int input=100;
        String expected="C";

        assertEquals(expected,Main.romanNumber(input));
    }

    @Test
    void romanNumber_shouldReturnLXXIV_whenCalledWith74() {
        int input=74;
        String expected="LXXIV";

        assertEquals(expected,Main.romanNumber(input));
    }
}
