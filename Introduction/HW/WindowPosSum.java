package Introduction.HW;

public class WindowPosSum {
    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSumSolution2(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }

    public static void windowPosSum(int[] a, int n)
    {
        if (n > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                if (a[i] >= 0)
                {
                    int sum = 0;
                    for (int j = 0; j <= n && i + j < a.length; j++)
                    {
                        sum += a[i + j];
                    }
                    a[i] = sum;
                }
            }
        }
    }

    public static void windowPosSumSolution2(int[] a, int n)
    {
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < 0)
            {
                continue;
            }
            else
            {
                int sum = 0;
                for (int j = 0; j <= n; j++)
                {
                    if (i + j >= a.length)
                    {
                        break;
                    }
                    sum += a[i + j];
                }
                a[i] = sum;
            }
        }
    }
}
