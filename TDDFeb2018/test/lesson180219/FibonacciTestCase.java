package lesson180219;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciTestCase {
    private int input;
    private String expected;
    private Fibonacci fibNum;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {0, "0"},
                {1, "1"},
                {2, "1"},
                {3, "2"},
                {4, "3"},
                {5, "5"},
        });
    }

    public FibonacciTestCase(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setup() {
        fibNum = new Fibonacci();
    }

    @Test
    public void shouldReturnExpectedWhenInput() {
        String result = fibNum.fibString(input);
        assertEquals(expected, result);
    }
}
