/*
 * Emily D'Alba
 */
import java.io.*;
public class BubbleSort 
{
    public static String [] stringBubbleSort(String [] arr)
    {
        long startTime = System.nanoTime();
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - 1 - i; j++)
            {
                if((int) arr[j].charAt(0) > (int) arr[j+1].charAt(0))
                {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        long endTime = System.nanoTime();
        long time = (endTime - startTime)/1000000;
        System.out.println("Run Time: " + time);
        return arr;
    }

    public static double [] doubleBubbleSort(double [] arr)
    {
        long startTime = System.nanoTime();
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - 1 - i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        long endTime = System.nanoTime();
        long time = (endTime - startTime)/1000000;
        System.out.println("Run Time: " + time);
        return arr;
    }

    public static int [] intBubbleSort(int [] arr)
    {
        long startTime = System.nanoTime();
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - 1 - i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        long endTime = System.nanoTime();
        long time = (endTime - startTime)/1000000;
        System.out.println("Run Time: " + time);
        return arr;
    }
}
