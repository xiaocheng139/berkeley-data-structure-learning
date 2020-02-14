package Introduction.Discussion;

public class Finonacci {
    public static int fib(int n)
    {
        if (n <= 1)
        {
            return n;
        }
        else
        {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fib2(int n, int k, int f1)
    {

    }
}
