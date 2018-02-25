package RomanNumerals;

public class RomanNumeralsAK {

    public static String arabicToRoman(int arabic) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arabic; i++) {
            sb.append("I");
        }
        return sb.toString();
    }
}
