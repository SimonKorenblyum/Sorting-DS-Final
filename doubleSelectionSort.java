public class doubleSelectionSort
{
    public static double [] doubleSelectionSort(double [] arr)
    {
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
        return arr;
    }
}
