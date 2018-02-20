package lesson180219;

public class Fibonacci {

    public static int fib(int i) {
        if (i == 0)
            return 0;
        else if (i == 1)
            return 1;
        else
            return fib(i - 1) + fib( i - 2);
    }

    public String fibString(int i) {
        return String.valueOf(fib(i));
    }
}
