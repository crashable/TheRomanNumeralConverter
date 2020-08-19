package no.kohort26;

import org.junit.jupiter.api.Test;

import static no.kohort26.RomanNumeralConverter.toRoman;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralConverterTests {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }
}
