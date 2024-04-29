/*
 * Emily D'Alba
 */
import java.io.*;
public class SelectionSort 
{
    public static int [] intSelectionSort(int [] arr)
    {
        long startTime = System.nanoTime();
        for(int i = 0; i < arr.length - 1; i++)
        {
            int minPos = i;
            for(int j = i+1; j < arr.length; j ++)
            {
                if(arr[j] < arr[minPos])
                {
                    int temp = arr[minPos];
                    arr[minPos] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorting time " + time);
        return arr;
    }
    public static double [] doubleSelectionSort(double [] arr)
    {
        long startTime = System.nanoTime();
        for(int i = 0; i < arr.length - 1; i++)
        {
            int minPos = i;
            for(int j = i+1; j < arr.length; j ++)
            {
                if(arr[j] < arr[minPos])
                {
                    double temp = arr[minPos];
                    arr[minPos] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorting time " + time);
        return arr;
    }
    public static String [] stringSelectionSort(String [] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int minPos = i;
            for(int j = i+1; j < arr.length; j ++)
            {
                if((int)arr[j].charAt(0) < (int)arr[minPos].charAt(0))
                {
                    String temp = arr[minPos];
                    arr[minPos] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
