package Introduction.HW;

public class Max {
    public static void main(String[] args) {
        int[] testIntegers = new int[]{1, 2, 3, 4, 5};
        int maxValue = max(testIntegers);
        System.out.println(maxValue);
    }

    public static int max(int[] args) {
        int maxValue = 0;
        for (int ele : args)
        {
            if(ele > maxValue)
            {
                maxValue = ele;
            }
        }
        return maxValue;
    }
}