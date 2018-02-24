package RomanNumerals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {

    @Before
    RomanNumerals rn = new RomanNumerals();

    @Test
    public void oneTwoThree() {
        Assert.assertEquals("I", rn.convertToRoman(1));
        Assert.assertEquals("II", rn.convertToRoman(2));
        Assert.assertEquals("III", rn.convertToRoman(3));
    }

    @Test
    public void four() {

    }
}