package Lists.Discussion;

public class Arrays {
    public static int[] insert(int[] arr, int item, int position) {
        int newSize = arr.length + 1;
        int[] result = new int[newSize];
        if (position > arr.length - 1)
        {
            position = arr.length - 1;
        }

        for (int index = 0; index < newSize; index++)
        {
            if (index < position)
            {
                result[index] = arr[index];
            }
            else if (index == position)
            {
                result[index] = item;
            }
            else
            {
                result[index] = arr[index - 1];
            }
        }
        return result;
    }

    public static int[] insertDestructively(int[] arr, int item, int position)
    {
        int newSize = arr.length + 1;
        arr = resize(arr, newSize);
        if (position > arr.length - 1)
        {
            position = arr.length - 1;
        }

        int endPointer = newSize - 1;
        while (endPointer >= 0)
        {
            int a =123;
            if (endPointer >= position && endPointer < newSize - 1) /* No need to change */
            {
                arr[endPointer + 1] = arr[endPointer];
            }

            if (endPointer == position)
            {
                arr[endPointer] = item;
                break;
            }

            endPointer--;
        }
        return arr;
    }

    public static int[] resize(int[] arr, int capacity)
    {
        int[] result = new int[capacity];
        System.arraycopy(arr, 0, result, 0, arr.length);
        return result;
    }

    public static void reverse(int[] arr) {
        if (arr == null || arr.length == 1)
        {
            return;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start + 1 < end)
        {
            int temp  = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start ++;
            end --;
        }
    }

    /*replaces the number at index i with arr[i] copies of itself */
    public static int[] replicate(int[] arr) {
        int size = 0;
        for (int element : arr)
        {
            size += element;
        }
        int[] result = new int[size];
        int i = 0;

        for (int value : arr) {
            for (int j = 0; j < value; j++) {
                result[i] = value;
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,7,12};
        arr = insertDestructively(arr, 8, 3);
        System.out.println(arr);
    }
}
