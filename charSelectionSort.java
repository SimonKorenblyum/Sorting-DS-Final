public class charSelectionSort 
{
    public static char [] charSelectionSort(char [] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int minPos = i;
            for(int j = i+1; j < arr.length; j ++)
            {
                if((int)arr[j] < (int)arr[minPos])
                {
                    char temp = arr[minPos];
                    arr[minPos] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
