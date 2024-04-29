public class HeapSort 
{
    public static String [] stringHeapSort(String [] arr)
    {
        long startTime = System.nanoTime();
        int length = arr.length; //gets length to make easier to acess
        for(int i = length / 2 - 1; i>= 0; i--)
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

    public static void sHeapify(String [] arrs, int rootPos, int length)
    {
        int maxPos = rootPos; //sets max to root of subtree to later compare to left and right child
        int leftCPos = 2 * rootPos + 2; //gets pos to left child 
        int rightCPos = 2 * rootPos + 1; 
        if(leftCPos < length && (int)arrs[leftCPos].charAt(0) > (int)arrs[maxPos].charAt(0))
        {
            maxPos = leftCPos;
        }
        if(rightCPos < length && (int)arrs[rightCPos].charAt(0) > (int)arrs[maxPos].charAt(0))
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
        long startTime = System.nanoTime();
        int length = arr.length; //gets length to make easier to acess
        for(int i = length / 2 - 1; i>= 0; i--)
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
        long startTime = System.nanoTime();
        int length = arr.length; //gets length to make easier to acess
        for(int i = length / 2 - 1; i>= 0; i--)
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
}
