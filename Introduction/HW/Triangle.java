package Introduction.HW;

public class Triangle {
    public static void main(String[] args)
    {
       drawTriangle(10);
    }

    public static void drawTriangle(int N)
    {
        int x = 0;
        while(x < N)
        {
            int startp = 0;
            while (startp <= x)
            {
                System.out.print("*");
                startp ++;
            }
            System.out.println("");
            x ++;
        }
    }
}
