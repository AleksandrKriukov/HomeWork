package RomanNumerals;

public class RomanNumeralsAK {

    private final static int[] NUMBERS = {10, 9, 5, 4, 1};
    private final static String[] SYMBOLS = {"X", "IX", "V", "IV", "I"};

    public static String arabicToRoman(int arabic) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < NUMBERS.length; i++) {
            arabic = convert(arabic, sb, NUMBERS[i], SYMBOLS[i]);
        }
        return sb.toString();
    }

    private static int convert(int arabic, StringBuilder sb, int value, String symbol) {
        while (arabic >= value) {
            sb.append(symbol);
            arabic -= value;
        }
        return arabic;
    }
}
