package RomanNumerals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {

    @Test
    public void one() {
        RomanNumerals rn = new RomanNumerals();
        Assert.assertEquals("I", rn.convertToRoman(1));
    }
}