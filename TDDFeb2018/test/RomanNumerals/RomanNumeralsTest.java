package RomanNumerals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {
    private RomanNumerals rn;

    @Before
    public void setup() {
        rn = new RomanNumerals();
    }

    @Test
    public void oneTwoThree() {
        Assert.assertEquals("I", rn.convertToRoman(1));
        Assert.assertEquals("II", rn.convertToRoman(2));
        Assert.assertEquals("III", rn.convertToRoman(3));
    }

    @Test
    public void four() {
        Assert.assertEquals("IV", rn.convertToRoman(4));
    }

    @Test
    public void fiveSixSevenEight() {
        Assert.assertEquals("V", rn.convertToRoman(5));
        Assert.assertEquals("VI", rn.convertToRoman(6));
        Assert.assertEquals("VII", rn.convertToRoman(7));
        Assert.assertEquals("VIII", rn.convertToRoman(8));
    }

    @Test
    public void nine() {
        Assert.assertEquals("IX", rn.convertToRoman(9));
    }

    @Test
    public void romanOneTwoThree() {
        Assert.assertEquals(1, rn.convertToArabic("I"));
        Assert.assertEquals(2, rn.convertToArabic("II"));
        Assert.assertEquals(3, rn.convertToArabic("III"));
    }

    @Test
    public void romanFour() {
        Assert.assertEquals(4, rn.convertToArabic("IV"));
    }

    @Test
    public void romanFiveSixSevenEight() {
        Assert.assertEquals(5, rn.convertToArabic("V"));
        Assert.assertEquals(6, rn.convertToArabic("VI"));
        Assert.assertEquals(7, rn.convertToArabic("VII"));
        Assert.assertEquals(8, rn.convertToArabic("VIII"));
    }

    @Test
    public void romanNine() {
        Assert.assertEquals(9, rn.convertToArabic("IX"));
    }

    @Test
    public void romanTenElevenTwelveThirteen() {
        Assert.assertEquals(10, rn.convertToArabic("X"));
        Assert.assertEquals(11, rn.convertToArabic("XI"));
        Assert.assertEquals(12, rn.convertToArabic("XII"));
        Assert.assertEquals(13, rn.convertToArabic("XIII"));
    }

    @After
    public void cleanup() {
        rn = null;
    }
}