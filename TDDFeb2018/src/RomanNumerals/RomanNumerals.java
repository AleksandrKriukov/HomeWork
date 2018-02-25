package RomanNumerals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RomanNumerals {

    public static final int[] VALUES = {10, 9, 5 , 4, 1};
    public static final String[] SYMBOLS = {"X", "IX", "V" , "IV", "I"};
    public static List<String> symbolsList = new ArrayList<>(Arrays.asList(SYMBOLS));

    public static String convertToRoman(int arabic) {
        StringBuilder sb = new StringBuilder();
        int remaining = arabic;

        for (int i = 0; i < VALUES.length; i++) {
            remaining = convert(sb, VALUES[i], SYMBOLS[i], remaining);
        }

        return sb.toString();
    }

    private static int convert(StringBuilder sb, int value, String roman, int remaining) {
        while (remaining >= value) {
            sb.append(roman);
            remaining -= value;
        }
        return remaining;
    }

    public static int convertToArabic(String roman) {
        int arabic = 0;
        int previous = 0;
        int current = 0;

        for (int i = 0; i < roman.length(); i++) {
            int index = symbolsList.indexOf(String.valueOf(roman.charAt(i)));
            current += VALUES[index];
            if ((previous < current) && (previous != 0)) {
                current -= previous;
                arabic -= previous;
            }
            arabic += current;
            previous = current;
            current = 0;
        }
        return arabic;
    }
}
