package testing;

public class TestSort {
    public static void testSort()
    {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);

        // Not right, it compares the addresses instead of the elements
//        if (input != expected)
//        {
//            System.out.println("Error");
//        }

//        if (input.length != expected.length)
//        {
//            System.out.println("Error");
//        }

        org.junit.Assert.assertArrayEquals(expected, input);
//        for (int i = 0; i < input.length; i++)
//        {
//            if (!input[i].equals(expected[i]))
//            {
//                System.out.format("Mismatch in position %s, expected: %s, but got: %s.", i, expected[i], input[i]);
//                break;
//            }
//        }
    }

    /** Test the Sort.findSmallest method */
    public static void testFindSmallest()
    {
        String[] input = {"i", "have", "an", "egg"};

        int expected = 2;
        int actual = Sort.findSmallest(input, 0);

        org.junit.Assert.assertEquals(expected, actual);

        String[] input2 = {"there", "are", "many", "pigs"};
        int expected2 = 1;
        int actual2 = Sort.findSmallest(input2, 0);
        org.junit.Assert.assertEquals(expected2, actual2);
    }

    /** Test the Sort.swap method */
    public static void testSwap()
    {
        String[] input = {"i", "have", "an", "egg"};
        int a = 0;
        int b = 2;

        String[] expected = {"an", "have", "i", "egg"};

        Sort.swap(input, a, b);
        org.junit.Assert.assertArrayEquals(input, expected);
    }

    public static void main(String[] args) {
        testSort();
        testFindSmallest();
        testSwap();
    }
}
