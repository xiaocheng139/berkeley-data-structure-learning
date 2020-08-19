package inheritance;

import lists.classTime.GenericSLList;
import lists.classTime.List61B;

/**
 * @author jack
 */
public class WordUtils {
    public static String longest(List61B<String> list)
    {
        int longest = 0;
        String longestStr = "";

        for (int i = 0; i < list.size(); i++)
        {
            String str = list.get(i);
            if (str.length() > longest)
            {
                longest = str.length();
                longestStr = str;
            }
        }
        
        return longestStr;
    }

    public static void main(String[] args) {
        GenericSLList<String> someList = new GenericSLList<>();
        someList.addLast("elk");
        someList.addLast("are");
        someList.addLast("watching");
        System.out.println(longest(someList));
    }
}
