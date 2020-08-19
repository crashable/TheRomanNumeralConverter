package no.kohort26;

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
}
