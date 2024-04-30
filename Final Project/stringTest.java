public class stringTest 
{
    public static void main(String []args)
    {
        //Testing String sorting methods
        //creating random String arrays
        String [] stringArr10a = arrCreator.stringArrR(10);
        String [] stringArr100a = arrCreator.stringArrR(100);
        String [] stringArr1000a = arrCreator.stringArrR(1000);
        String [] stringArr10000a = arrCreator.stringArrR(10000);
        String [] stringArr50000a = arrCreator.stringArrR(50000);
        String [] stringArr100000a = arrCreator.stringArrR(100000);
        String [] stringArr500000a = arrCreator.stringArrR(500000);

        //unsorted String bubble sort
        System.out.println("String Sorting methods: ");
        System.out.println("Bubble Sort (Unsorted): ");
        System.out.print("String bubble sort 10 (US) : ");
        String [] stringArr10bs = BubbleSort.stringBubbleSort(stringArr10a);
        System.out.print("String bubble sort 100 (US) : ");
        String [] stringArr100bs = BubbleSort.stringBubbleSort(stringArr100a);
        System.out.print("String bubble sort 1000 (US) : ");
        String [] stringArr1000bs = BubbleSort.stringBubbleSort(stringArr1000a);
        System.out.print("String bubble sort 10000 (US) : ");
        String [] stringArr10000bs = BubbleSort.stringBubbleSort(stringArr10000a);
        System.out.print("String bubble sort 50000 (US) : ");
        String [] stringArr50000bs = BubbleSort.stringBubbleSort(stringArr50000a);
        System.out.print("String bubble sort 100000 (US) : ");
        String [] stringArr100000bs = BubbleSort.stringBubbleSort(stringArr100000a);
        System.out.print("String bubble sort 500000 (US) : ");
        String [] stringArr500000bs = BubbleSort.stringBubbleSort(stringArr500000a);

        //sorted String bubble sort
        System.out.println("Bubble Sort (Sorted): ");
        System.out.print("String bubble sort 10 (S) : ");
        BubbleSort.stringBubbleSort(stringArr10bs);
        System.out.print("String bubble sort 100 (S) : ");
        BubbleSort.stringBubbleSort(stringArr100bs);
        System.out.print("String bubble sort 1000 (S) : ");
        BubbleSort.stringBubbleSort(stringArr1000bs);
        System.out.print("String bubble sort 10000 (S) : ");
        BubbleSort.stringBubbleSort(stringArr10000bs);
        System.out.print("String bubble sort 50000 (S) : ");
        BubbleSort.stringBubbleSort(stringArr50000bs);
        System.out.print("String bubble sort 100000 (S) : ");
        BubbleSort.stringBubbleSort(stringArr100000bs);
        System.out.print("String bubble sort 500000 (S) : ");
        BubbleSort.stringBubbleSort(stringArr500000bs);
        
        //unsorted String selection sort
        System.out.println("Selection Sort (Unsorted): ");
        System.out.print("String Selection sort 10 (US) : ");
        String [] stringArr10ss = SelectionSort.stringSelectionSort(stringArr10a);
        System.out.print("String Selection sort 100 (US) : ");
        String [] stringArr100ss = SelectionSort.stringSelectionSort(stringArr100a);
        System.out.print("String Selection sort 1000 (US) : ");
        String [] stringArr1000ss = SelectionSort.stringSelectionSort(stringArr1000a);
        System.out.print("String Selection sort 10000 (US) : ");
        String [] stringArr10000ss = SelectionSort.stringSelectionSort(stringArr10000a);
        System.out.print("String Selection sort 50000 (US) : ");
        String [] stringArr50000ss = SelectionSort.stringSelectionSort(stringArr50000a);
        System.out.print("String Selection sort 100000 (US) : ");
        String [] stringArr100000ss = SelectionSort.stringSelectionSort(stringArr100000a);
        System.out.print("String Selection sort 500000 (US) : ");
        String [] stringArr500000ss = SelectionSort.stringSelectionSort(stringArr500000a);

        //sorted String Selection sort
        System.out.println("Selection Sort (Sorted): ");
        System.out.print("String Selection sort 10 (S) : ");
        SelectionSort.stringSelectionSort(stringArr10ss);
        System.out.print("String Selection sort 100 (S) : ");
        SelectionSort.stringSelectionSort(stringArr100ss);
        System.out.print("String Selection sort 1000 (S) : ");
        SelectionSort.stringSelectionSort(stringArr1000ss);
        System.out.print("String Selection sort 10000 (S) : ");
        SelectionSort.stringSelectionSort(stringArr10000ss);
        System.out.print("String Selection sort 50000 (S) : ");
        SelectionSort.stringSelectionSort(stringArr50000ss);
        System.out.print("String Selection sort 100000 (S) : ");
        SelectionSort.stringSelectionSort(stringArr100000ss);
        System.out.print("String Selection sort 500000 (S) : ");
        SelectionSort.stringSelectionSort(stringArr500000ss);
        
        //unsorted String heap sort
        System.out.println("Heap Sort (Unsorted): ");
        System.out.print("String Heap sort 10 (US) : ");
        String [] stringArr10hs = HeapSort.stringHeapSort(stringArr10a);
        System.out.print("String Heap sort 100 (US) : ");
        String [] stringArr100hs = HeapSort.stringHeapSort(stringArr100a);
        System.out.print("String Heap sort 1000 (US) : ");
        String [] stringArr1000hs = HeapSort.stringHeapSort(stringArr1000a);
        System.out.print("String Heap sort 10000 (US) : ");
        String [] stringArr10000hs = HeapSort.stringHeapSort(stringArr10000a);
        System.out.print("String Heap sort 50000 (US) : ");
        String [] stringArr50000hs = HeapSort.stringHeapSort(stringArr50000a);
        System.out.print("String Heap sort 100000 (US) : ");
        String [] stringArr100000hs = HeapSort.stringHeapSort(stringArr100000a);
        System.out.print("String Heap sort 500000 (US) : ");
        String [] stringArr500000hs = HeapSort.stringHeapSort(stringArr500000a);

        //sorted String Heap sort
        System.out.println("Heap Sort (Sorted): ");
        System.out.print("String Heap sort 10 (S) : ");
        HeapSort.stringHeapSort(stringArr10hs);
        System.out.print("String Heap sort 100 (S) : ");
        HeapSort.stringHeapSort(stringArr100hs);
        System.out.print("String Heap sort 1000 (S) : ");
        HeapSort.stringHeapSort(stringArr1000hs);
        System.out.print("String Heap sort 10000 (S) : ");
        HeapSort.stringHeapSort(stringArr10000hs);
        System.out.print("String Heap sort 50000 (S) : ");
        HeapSort.stringHeapSort(stringArr50000hs);
        System.out.print("String Heap sort 100000 (S) : ");
        HeapSort.stringHeapSort(stringArr100000hs);
        System.out.print("String Heap sort 500000 (S) : ");
        HeapSort.stringHeapSort(stringArr500000hs);
    }
}
