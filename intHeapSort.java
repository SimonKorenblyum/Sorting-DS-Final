public class intHeapSort 
{
   
    public static int[] intHeapSort(int[] arr)
    {
        int length = arr.length; //gets length to make easier to acess
        for(int i = length / 2 - 1; i>= 0; i--)
        {
            heapify(arr, i, length);
        }

        for(int j = length - 1; j>= 0; j--)
        {
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
            heapify(arr, 0, j);
        }

        return arr;
    }

    public static void heapify(int [] arrs, int rootPos, int length)
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
            heapify(arrs, maxPos, length);
        }
    }
}
