import java.io.*;
public class charBubbleSort
{
    public static char [] charBubbleSort(char [] arr)
    {

        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - 1 - i; j++)
            {
                if((int)arr[j] > (int)arr[j+1])
                {
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
        return arr;
    }
}
