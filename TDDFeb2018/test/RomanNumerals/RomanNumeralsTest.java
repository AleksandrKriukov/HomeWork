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

    @After
    public void cleanup() {
        rn = null;
    }
}