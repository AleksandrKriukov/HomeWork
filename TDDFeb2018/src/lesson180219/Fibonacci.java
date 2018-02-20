package lesson180219;

public class Fibonacci {

    public static int fib(int i) {
        if (i == 0)
            return 0;
        if (i == 1)
            return 1;
        return fib(i - 1) + fib(i - 2);
    }

    public String fibString(int i) {
        return String.valueOf(fib(i));
    }
}
