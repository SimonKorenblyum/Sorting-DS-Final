public class charHeapSort 
{
       
    public static char[] charHeapSort(char[] arr)
    {
        int length = arr.length; //gets length to make easier to acess
        for(int i = length / 2 - 1; i>= 0; i--)
        {
            heapify(arr, i, length);
        }

        for(int j = length - 1; j>= 0; j--)
        {
            char temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
            heapify(arr, 0, j);
        }

        return arr;
    }

    public static void heapify(char [] arrs, int rootPos, int length)
    {
        int maxPos = rootPos; //sets max to root of subtree to later compare to left and right child
        int leftCPos = 2 * rootPos + 2; //gets pos to left child 
        int rightCPos = 2 * rootPos + 1; 
        if(leftCPos < length && (int)arrs[leftCPos] > (int)arrs[maxPos])
        {
            maxPos = leftCPos;
        }
        if(rightCPos < length && (int)arrs[rightCPos] > (int)arrs[maxPos])
        {
            maxPos = rightCPos;
        }

        if(rootPos != maxPos)
        {
            char temp = arrs[rootPos];
            arrs[rootPos] = arrs[maxPos];
            arrs[maxPos] = temp;
            heapify(arrs, maxPos, length);
        }
    }
}
