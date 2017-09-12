package Basics.Array;

import Utility.ArrayUtility;

/**
 * Created by uslabs on 9/11/17.
 */
public class RotateArray
{
    /*Function to left rotate arr[] of siz n by d*/
    public static void leftRotate(int arr[], int d, int n)
    {
        int i, j, k, temp;
        for (i = 0; i < ArrayUtility.gcd(d, n); i++)
        {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (1 != 0)
            {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    public static void solution(){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        leftRotate(arr, 5, 8);
        ArrayUtility.printArray(arr);
    }
}