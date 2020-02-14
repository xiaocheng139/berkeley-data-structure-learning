package Introduction;

public class Triangle {
    public static void main(String[] args)
    {
        int x = 1;
        while(x < 10)
        {
            int startp = 0;
            while (startp < x)
            {
                System.out.print("*");
                startp ++;
            }
            System.out.println("");
            x ++;
        }
    }
}
