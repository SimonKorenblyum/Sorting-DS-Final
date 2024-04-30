public class quickSort 
{
    static void intQuickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = intPartition(arr, low, high);
            intQuickSort(arr, low, pi - 1);
            intQuickSort(arr, pi + 1, high);
        }
    }
    static int intPartition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) 
        {
            if (arr[j] < pivot) 
            {
                i++;
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
            }
        }
        int temp2 = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp2;
        return (i + 1);
    }

    static void dQuickSort(double[] arr, int low, int high)
    {
        if (low < high) {
            int pi = dPartition(arr, low, high);
            dQuickSort(arr, low, pi - 1);
            dQuickSort(arr, pi + 1, high);
        }
    }
    static int dPartition(double[] arr, int low, int high)
    {
        double pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) 
        {
            if (arr[j] < pivot) 
            {
                i++;
                double temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
            }
        }
        double temp2 = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp2;
        return (i + 1);
    }
}
