package RomanNumerals;

public class RomanNumerals {

    public static String convertToRoman(int arabic) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arabic; i++) {
            sb.append("I");
        }
        return sb.toString();
    }
}
