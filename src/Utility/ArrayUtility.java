package Utility;

/**
 * Created by uslabs on 9/11/17.
 */
public class ArrayUtility {
    /*UTILITY FUNCTIONS*/

    /* function to print an array */
    public static void printArray(int arr[])
    {
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    /*Fuction to get gcd of a and b*/
    public static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
