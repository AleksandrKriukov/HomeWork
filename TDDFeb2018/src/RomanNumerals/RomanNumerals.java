package RomanNumerals;

public class RomanNumerals {

    public static final int[] VALUES = {9, 5 , 4, 1};
    public static final String[] SYMBOLS = {"IX", "V" , "IV", "I"};
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
}
