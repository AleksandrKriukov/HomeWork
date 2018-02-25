package RomanNumerals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RomanNumeralsAKTest {
    private int input;
    private String expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "I"},
                {2, "II"},
                {3, "III"},
        });
    }

    public RomanNumeralsAKTest(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test(timeout = 10)
    public void shouldReturnExpectedWhenInput() {
        String result = RomanNumeralsAK.arabicToRoman(input);
        assertEquals(expected, result);
    }
}