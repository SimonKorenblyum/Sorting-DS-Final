/*
 * Emily D'Alba
 */
//import java.io.*;
public class SelectionSort 
{
    public static int [] intSelectionSort(int [] arr)
    {
        long startTime = System.nanoTime(); //starts recording start time 
        for(int i = 0; i < arr.length - 1; i++) //shifts elements
        {
            int minPos = i;
            for(int j = i+1; j < arr.length; j ++) //finds minimum element
            {
                if(arr[j] < arr[minPos]) //checks if min
                {
                    int temp = arr[minPos];
                    arr[minPos] = arr[j]; //swaps first element in bounds to found minimum 
                    arr[j] = temp;
                }
            }
        }
        long endTime = System.nanoTime(); //ends recording time 
        long time = (endTime - startTime);
        System.out.println("Sorting time " + time); //returns print time
        return arr;
    }
    public static double [] doubleSelectionSort(double [] arr)
    {
        long startTime = System.nanoTime(); //starts recording start time 
        for(int i = 0; i < arr.length - 1; i++) //shifts elements
        {
            int minPos = i;
            for(int j = i+1; j < arr.length; j ++) //finds minimum element
            {
                if(arr[j] < arr[minPos]) //checks if min
                {
                    double temp = arr[minPos];
                    arr[minPos] = arr[j]; //swaps first element in bounds to found minimum 
                    arr[j] = temp;
                }
            }
        }
        long endTime = System.nanoTime(); //ends recording time
        long time = (endTime - startTime);
        System.out.println("Sorting time " + time); //prints run time
        return arr;
    }

    public static String [] stringSelectionSort(String [] arr)
    {
        long startTime = System.nanoTime(); //starts recording start time
        for(int i = 0; i < arr.length - 1; i++) //shifts elements
        {
            int minPos = i;
            for(int j = i+1; j < arr.length; j ++) //finds minimum element
            {
                //if((int)arr[j].charAt(0) < (int)arr[minPos].charAt(0)) //is not used because length is greater than 0
                if(priorityString(arr[j], arr[minPos]))
                {
                    String temp = arr[minPos];
                    arr[minPos] = arr[j]; //swaps first element in bounds to found minimum 
                    arr[j] = temp;
                }
            }
        }
        long endTime = System.nanoTime(); //ends recording time
        long time = (endTime - startTime);
        System.out.println("Sorting time " + time); //prints run time
        return arr;
    }

    /**
     * checks which string has alphabetical priority for comparision within sorting method =
     * @param s1 string one
     * @param s2 string two
     * @return true or false depening on priority
     */
    public static boolean priorityString(String s1, String s2) //if first is higher number than second  length of 7
    {
        for(int i = 0; i < 7; i++) //checks each letter, set to 7 bc all strings have length of 7
        {
            if(s1.charAt(i) != s2.charAt(i)) //if letter is same itterates to next to check
            {
                if((int)s1.charAt(i) < (int) s1.charAt(i))//checks which is higher alphabetically according to ASCII
                {
                    return true; //returns true
                }
                else
                {
                    return false; //returns false
                }
            }
        }
        return false; //if string is same it returns false 
    }
}
