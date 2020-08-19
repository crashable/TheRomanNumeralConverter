package no.kohort26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralConverter {

    /*  Roman Numerals for Reference
    Symbol	I	V	X	L	C	D	M
    Value	1	5	10	50	100	500	1000
    */

    private static final String[] thousands = {"", "M", "MM", "MMM"};
    private static final String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String [] ones = {"", "I", "II", "III" ,"IV", "V", "VI", "VII", "VIII", "IX"};

    public final static String toRoman(int number) {
        String th = thousands[number / 1000];
        String hu = hundreds[(number % 1000) / 100];
        String te = tens[(number % 100) / 10];
        String on = ones[number % 10];
        return th + hu + te + on;
    }

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }
    @Test
    void shouldConvert2ToII() {
        assertEquals("II", toRoman(2));
    }
    @Test
    void shouldConvert3toIII() {
        assertEquals("III", toRoman(3));
    }
    @Test
    void shouldConvert4toIV() {
        assertEquals("IV", toRoman(4));
    }
    @Test
    void shouldConvert5toV() {
        assertEquals("V", toRoman(5));
    }
    @Test
    void shouldConvert6ToVI() {
        assertEquals("VI", toRoman(6));
    }
    @Test
    void shouldConvert7ToVII() {
        assertEquals("VII", toRoman(7));
    }
    @Test
    void shouldConvert8ToVIII() {
        assertEquals("VIII", toRoman(8));
    }
    @Test
    void shouldConvert9ToIX() {
        assertEquals("IX", toRoman(9));
    }
    @Test
    void shouldConvert10ToX() {
        assertEquals("X", toRoman(10));
    }
}
