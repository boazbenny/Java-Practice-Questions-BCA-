// 3.Write a program to sort strings in alphabetical order.

import java.util.Arrays;

public class stringsort {
    public static void main(String ar[]) {
        if (ar.length == 0) {
            System.out.println("Enter string for sorting ...");
        }
        else{
            System.out.println("String before sorting...");
            for(int i=0;i<ar.length;i++)
            {
                System.out.println(ar[i]);
            }
            Arrays.sort(ar);
            System.out.println("Sorted Strings be like ...");
            for(int i=0;i<ar.length;i++)
            {
                System.out.println(ar[i]);
            }
        }
        
    }
}
