package lesson180219;

import org.junit.Test;

import static junit.framework.TestCase.fail;

public class FibonacciNegativeTest {

    /*@Test
    public void shouldReturnExceptionWhenNegative() throws Exception{
        try {
            Fibonacci fibNum = new Fibonacci();
            fibNum.fib(-1);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {

        }
    }*/

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionWhenNegative() throws Exception {
        Fibonacci fibNum = new Fibonacci();
        fibNum.fib(-1);
    }
}