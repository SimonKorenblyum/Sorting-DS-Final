/**
 * Emily D'Alba
 */
//import java.io.*;
public class HeapSort 
{
    public static String [] stringHeapSort(String [] arr)
    {
        long startTime = System.nanoTime(); //starts function of recording time
        int length = arr.length; //gets length to make easier to acess
        for(int i = length / 2 - 1; i>= 0; i--) //rearanges array to heap
        {
            sHeapify(arr, i, length); 
        }

        for(int j = length - 1; j>= 0; j--)
        {
            String temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
            sHeapify(arr, 0, j);
        }
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Run Time: " + time);
        return arr;
    }

    /**
     * Heapifys string array, treats given pos as root of own tree
     * @param arrs array to be heapified
     * @param rootPos "root" of tree
     * @param length length of array
     */
    public static void sHeapify(String [] arrs, int rootPos, int length)
    {
        int maxPos = rootPos; //sets max to root of subtree to later compare to left and right child
        int leftCPos = 2 * rootPos + 2; //gets pos to left child 
        int rightCPos = 2 * rootPos + 1; 
        //if(leftCPos < length && (int)arrs[leftCPos].charAt(0) > (int)arrs[maxPos].charAt(0)) //is not used because string length is greater than 0
        if(leftCPos < length && priorityString(arrs[leftCPos], arrs[maxPos]))
        {
            maxPos = leftCPos;
        }
        //if(rightCPos < length && (int)arrs[rightCPos].charAt(0) > (int)arrs[maxPos].charAt(0)) //is not used because string length is greater than 0
        if(rightCPos < length && priorityString(arrs[rightCPos], arrs[maxPos]))
        {
            maxPos = rightCPos;
        }

        if(rootPos != maxPos)
        {
            String temp = arrs[rootPos];
            arrs[rootPos] = arrs[maxPos];
            arrs[maxPos] = temp;
            sHeapify(arrs, maxPos, length);
        }
    }

    public static double[] doubleHeapSort(double[] arr)
    {
        long startTime = System.nanoTime(); //starts function of recording time
        int length = arr.length; //gets length to make easier to acess
        for(int i = length / 2 - 1; i>= 0; i--) //rearanges array to heap
        {
            dHeapify(arr, i, length);
        }

        for(int j = length - 1; j>= 0; j--)
        {
            double temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
            dHeapify(arr, 0, j);
        }
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Run Time: " + time);
        return arr;
    }

    /**
     * Heapifys double array, treats given pos as root of own tree
     * @param arrs array to be heapified
     * @param rootPos "root" of tree
     * @param length length of array
     */
    public static void dHeapify(double [] arrs, int rootPos, int length)
    {
        int maxPos = rootPos; //sets max to root of subtree to later compare to left and right child
        int leftCPos = 2 * rootPos + 2; //gets pos to left child 
        int rightCPos = 2 * rootPos + 1; 
        if(leftCPos < length && arrs[leftCPos] > arrs[maxPos])
        {
            maxPos = leftCPos;
        }
        if(rightCPos < length && arrs[rightCPos] > arrs[maxPos])
        {
            maxPos = rightCPos;
        }

        if(rootPos != maxPos)
        {
            double temp = arrs[rootPos];
            arrs[rootPos] = arrs[maxPos];
            arrs[maxPos] = temp;
            dHeapify(arrs, maxPos, length);
        }
    }

    public static int[] intHeapSort(int[] arr)
    {
        long startTime = System.nanoTime(); //starts function of recording time
        int length = arr.length; //gets length to make easier to acess
        for(int i = length / 2 - 1; i>= 0; i--) //rearanges array to heap
        {
            iHeapify(arr, i, length);
        }

        for(int j = length - 1; j>= 0; j--)
        {
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
            iHeapify(arr, 0, j);
        }
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Run Time: " + time);
        return arr;
    }

    /**
     * Heapifys int array, treats given pos as root of own tree
     * @param arrs array to be heapified
     * @param rootPos "root" of tree
     * @param length length of array
     */
    public static void iHeapify(int [] arrs, int rootPos, int length)
    {
        int maxPos = rootPos; //sets max to root of subtree to later compare to left and right child
        int leftCPos = 2 * rootPos + 2; //gets pos to left child 
        int rightCPos = 2 * rootPos + 1; 
        if(leftCPos < length && arrs[leftCPos] > arrs[maxPos])
        {
            maxPos = leftCPos;
        }
        if(rightCPos < length && arrs[rightCPos] > arrs[maxPos])
        {
            maxPos = rightCPos;
        }

        if(rootPos != maxPos)
        {
            int temp = arrs[rootPos];
            arrs[rootPos] = arrs[maxPos];
            arrs[maxPos] = temp;
            iHeapify(arrs, maxPos, length);
        }
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
