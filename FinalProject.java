public class FinalProject
{
    public static void main(String[] args) 
    {
        //Testing integer sorting methods
        //creating random int arrays
        int [] intArr10a = arrCreator.intArrR(10);
        int [] intArr100a = arrCreator.intArrR(100);
        int [] intArr1000a = arrCreator.intArrR(1000);
        int [] intArr10000a = arrCreator.intArrR(10000);
        int [] intArr50000a = arrCreator.intArrR(50000);
        int [] intArr100000a = arrCreator.intArrR(100000);
        int [] intArr500000a = arrCreator.intArrR(500000);

        //unsorted int bubble sort
        System.out.println("Integer Sorting methods: ");
        System.out.println("Bubble Sort (Unsorted): ");
        System.out.print("Int bubble sort 10 (US) : ");
        int [] intArr10bs = BubbleSort.intBubbleSort(intArr10a);
        System.out.print("Int bubble sort 100 (US) : ");
        int [] intArr100bs = BubbleSort.intBubbleSort(intArr100a);
        System.out.print("Int bubble sort 1000 (US) : ");
        int [] intArr1000bs = BubbleSort.intBubbleSort(intArr1000a);
        System.out.print("Int bubble sort 10000 (US) : ");
        int [] intArr10000bs = BubbleSort.intBubbleSort(intArr10000a);
        System.out.print("Int bubble sort 50000 (US) : ");
        int [] intArr50000bs = BubbleSort.intBubbleSort(intArr50000a);
        System.out.print("Int bubble sort 100000 (US) : ");
        int [] intArr100000bs = BubbleSort.intBubbleSort(intArr100000a);
        System.out.print("Int bubble sort 500000 (US) : ");
        int [] intArr500000bs = BubbleSort.intBubbleSort(intArr500000a);

        //sorted int bubble sort
        System.out.println("Bubble Sort (Sorted): ");
        System.out.print("Int bubble sort 10 (S) : ");
        BubbleSort.intBubbleSort(intArr10bs);
        System.out.print("Int bubble sort 100 (S) : ");
        BubbleSort.intBubbleSort(intArr100bs);
        System.out.print("Int bubble sort 1000 (S) : ");
        BubbleSort.intBubbleSort(intArr1000bs);
        System.out.print("Int bubble sort 10000 (S) : ");
        BubbleSort.intBubbleSort(intArr10000bs);
        System.out.print("Int bubble sort 50000 (S) : ");
        BubbleSort.intBubbleSort(intArr50000bs);
        System.out.print("Int bubble sort 100000 (S) : ");
        BubbleSort.intBubbleSort(intArr100000bs);
        //System.out.print("Int bubble sort 500000 (S) : ");
        //BubbleSort.intBubbleSort(intArr500000bs);
        
        //unsorted int selection sort
        System.out.println("Selection Sort (Unsorted): ");
        System.out.print("Int Selection sort 10 (US) : ");
        int [] intArr10ss = SelectionSort.intSelectionSort(intArr10a);
        System.out.print("Int Selection sort 100 (US) : ");
        int [] intArr100ss = SelectionSort.intSelectionSort(intArr100a);
        System.out.print("Int Selection sort 1000 (US) : ");
        int [] intArr1000ss = SelectionSort.intSelectionSort(intArr1000a);
        System.out.print("Int Selection sort 10000 (US) : ");
        int [] intArr10000ss = SelectionSort.intSelectionSort(intArr10000a);
        System.out.print("Int Selection sort 50000 (US) : ");
        int [] intArr50000ss = SelectionSort.intSelectionSort(intArr50000a);
        System.out.print("Int Selection sort 100000 (US) : ");
        int [] intArr100000ss = SelectionSort.intSelectionSort(intArr100000a);
        System.out.print("Int Selection sort 500000 (US) : ");
        int [] intArr500000ss = SelectionSort.intSelectionSort(intArr500000a);

        //sorted int Selection sort
        System.out.println("Selection Sort (Sorted): ");
        System.out.print("Int Selection sort 10 (S) : ");
        SelectionSort.intSelectionSort(intArr10ss);
        System.out.print("Int Selection sort 100 (S) : ");
        SelectionSort.intSelectionSort(intArr100ss);
        System.out.print("Int Selection sort 1000 (S) : ");
        SelectionSort.intSelectionSort(intArr1000ss);
        System.out.print("Int Selection sort 10000 (S) : ");
        SelectionSort.intSelectionSort(intArr10000ss);
        System.out.print("Int Selection sort 50000 (S) : ");
        SelectionSort.intSelectionSort(intArr50000ss);
        System.out.print("Int Selection sort 100000 (S) : ");
        SelectionSort.intSelectionSort(intArr100000ss);
        System.out.print("Int Selection sort 500000 (S) : ");
        SelectionSort.intSelectionSort(intArr500000ss);
        
        //unsorted int heap sort
        System.out.println("Heap Sort (Unsorted): ");
        System.out.print("Int Heap sort 10 (US) : ");
        int [] intArr10hs = HeapSort.intHeapSort(intArr10a);
        System.out.print("Int Heap sort 100 (US) : ");
        int [] intArr100hs = HeapSort.intHeapSort(intArr100a);
        System.out.print("Int Heap sort 1000 (US) : ");
        int [] intArr1000hs = HeapSort.intHeapSort(intArr1000a);
        System.out.print("Int Heap sort 10000 (US) : ");
        int [] intArr10000hs = HeapSort.intHeapSort(intArr10000a);
        System.out.print("Int Heap sort 50000 (US) : ");
        int [] intArr50000hs = HeapSort.intHeapSort(intArr50000a);
        System.out.print("Int Heap sort 100000 (US) : ");
        int [] intArr100000hs = HeapSort.intHeapSort(intArr100000a);
        System.out.print("Int Heap sort 500000 (US) : ");
        int [] intArr500000hs = HeapSort.intHeapSort(intArr500000a);

        //sorted int Heap sort
        System.out.println("Heap Sort (Sorted): ");
        System.out.print("Int Heap sort 10 (S) : ");
        HeapSort.intHeapSort(intArr10hs);
        System.out.print("Int Heap sort 100 (S) : ");
        HeapSort.intHeapSort(intArr100hs);
        System.out.print("Int Heap sort 1000 (S) : ");
        HeapSort.intHeapSort(intArr1000hs);
        System.out.print("Int Heap sort 10000 (S) : ");
        HeapSort.intHeapSort(intArr10000hs);
        System.out.print("Int Heap sort 50000 (S) : ");
        HeapSort.intHeapSort(intArr50000hs);
        System.out.print("Int Heap sort 100000 (S) : ");
        HeapSort.intHeapSort(intArr100000hs);
        System.out.print("Int Heap sort 500000 (S) : ");
        HeapSort.intHeapSort(intArr500000hs);

    }

}
