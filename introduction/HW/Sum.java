package introduction.HW;

public class Sum
{
    public static void main(String[] args) {
        int[] testArray = new int[]{1, 2, 3, 4, 5};
        int whileSumResult = whileSum(testArray);
        int forSumResult = forSum(testArray);
        System.out.println(whileSumResult);
        System.out.println(forSumResult);
    }

    public static int whileSum(int[] nums)
    {
        int sum = 0;
        int index = 0;
        while(index < nums.length)
        {
            sum += nums[index];
            index ++;
        }
        return sum;
    }

    public static int forSum(int[] nums)
    {
        int sum = 0;
        for(int i = 0; i < nums.length; i ++)
        {
            sum += nums[i];
        }
        return sum;
    }
}