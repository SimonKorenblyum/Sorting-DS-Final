public class doubleBubbleSort 
{
    public static double [] doubleBubbleSort(double [] arr)
    {
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
        return arr;
    }
}
