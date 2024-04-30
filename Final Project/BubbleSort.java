/*
 * Emily D'Alba
 */
//import java.io.*;
public class BubbleSort 
{
    public static String [] stringBubbleSort(String [] arr)
    {
        long startTime = System.nanoTime(); //starts recording start time
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - 1 - i; j++)
            {
                //if((int) arr[j].charAt(0) > (int) arr[j+1].charAt(0)) //not used because strings have length greater than one
                if(priorityString(arr[j], arr[j+1]))
                {
                    String temp = arr[j]; //swaps the two values
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        long endTime = System.nanoTime(); //ends recording start time
        long time = (endTime - startTime);
        System.out.println("Run Time: " + time); //prints run time
        return arr;
    }

    public static double [] doubleBubbleSort(double [] arr)
    {
        long startTime = System.nanoTime(); //starts recording start time
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - 1 - i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    double temp = arr[j]; //swaps the two values
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        long endTime = System.nanoTime(); //ends recording start time
        long time = (endTime - startTime);
        System.out.println("Run Time: " + time); //prints run time
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
                    int temp = arr[j]; //swaps the two values
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        long endTime = System.nanoTime(); //ends recording start time
        long time = (endTime - startTime);
        System.out.println("Run Time: " + time); //prints run time
        return arr;
    }

    /**
     * for string sorting method
     * checks which string has alphabetical priority for comparision within sorting method 
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
                if((int)s1.charAt(i) > (int) s1.charAt(i))//checks which is higher alphabetically according to ASCII
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
