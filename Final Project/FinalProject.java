import java.util.*;

public class FinalProject
{
    public static void main(String[] args) {
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
        System.out.print("Int bubble sort 500000 (S) : ");
        BubbleSort.intBubbleSort(intArr500000bs);
        
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

    int[] sizes = {10, 100, 1000, 10000, 50000, 100000, 500000};
        //Testing double sorting methods
        //creating random double arrays
        double [] doubleArr10a = arrCreator.doubleArrR(10);
        double [] doubleArr100a = arrCreator.doubleArrR(100);
        double [] doubleArr1000a = arrCreator.doubleArrR(1000);
        double [] doubleArr10000a = arrCreator.doubleArrR(10000);
        double [] doubleArr50000a = arrCreator.doubleArrR(50000);
        double [] doubleArr100000a = arrCreator.doubleArrR(100000);
        double [] doubleArr500000a = arrCreator.doubleArrR(500000);

        //unsorted double bubble sort
        System.out.println("double Sorting methods: ");
        System.out.println("Bubble Sort (Unsorted): ");
        System.out.print("double bubble sort 10 (US) : ");
        double [] doubleArr10bs = BubbleSort.doubleBubbleSort(doubleArr10a);
        System.out.print("double bubble sort 100 (US) : ");
        double [] doubleArr100bs = BubbleSort.doubleBubbleSort(doubleArr100a);
        System.out.print("double bubble sort 1000 (US) : ");
        double [] doubleArr1000bs = BubbleSort.doubleBubbleSort(doubleArr1000a);
        System.out.print("double bubble sort 10000 (US) : ");
        double [] doubleArr10000bs = BubbleSort.doubleBubbleSort(doubleArr10000a);
        System.out.print("double bubble sort 50000 (US) : ");
        double [] doubleArr50000bs = BubbleSort.doubleBubbleSort(doubleArr50000a);
        System.out.print("double bubble sort 100000 (US) : ");
        double [] doubleArr100000bs = BubbleSort.doubleBubbleSort(doubleArr100000a);
        System.out.print("double bubble sort 500000 (US) : ");
        double [] doubleArr500000bs = BubbleSort.doubleBubbleSort(doubleArr500000a);

        //sorted double bubble sort
        System.out.println("Bubble Sort (Sorted): ");
        System.out.print("double bubble sort 10 (S) : ");
        BubbleSort.doubleBubbleSort(doubleArr10bs);
        System.out.print("double bubble sort 100 (S) : ");
        BubbleSort.doubleBubbleSort(doubleArr100bs);
        System.out.print("double bubble sort 1000 (S) : ");
        BubbleSort.doubleBubbleSort(doubleArr1000bs);
        System.out.print("double bubble sort 10000 (S) : ");
        BubbleSort.doubleBubbleSort(doubleArr10000bs);
        System.out.print("double bubble sort 50000 (S) : ");
        BubbleSort.doubleBubbleSort(doubleArr50000bs);
        System.out.print("double bubble sort 100000 (S) : ");
        BubbleSort.doubleBubbleSort(doubleArr100000bs);
        System.out.print("double bubble sort 500000 (S) : ");
        BubbleSort.doubleBubbleSort(doubleArr500000bs);
        
        //unsorted double selection sort
        System.out.println("Selection Sort (Unsorted): ");
        System.out.print("double Selection sort 10 (US) : ");
        double [] doubleArr10ss = SelectionSort.doubleSelectionSort(doubleArr10a);
        System.out.print("double Selection sort 100 (US) : ");
        double [] doubleArr100ss = SelectionSort.doubleSelectionSort(doubleArr100a);
        System.out.print("double Selection sort 1000 (US) : ");
        double [] doubleArr1000ss = SelectionSort.doubleSelectionSort(doubleArr1000a);
        System.out.print("double Selection sort 10000 (US) : ");
        double [] doubleArr10000ss = SelectionSort.doubleSelectionSort(doubleArr10000a);
        System.out.print("double Selection sort 50000 (US) : ");
        double [] doubleArr50000ss = SelectionSort.doubleSelectionSort(doubleArr50000a);
        System.out.print("double Selection sort 100000 (US) : ");
        double [] doubleArr100000ss = SelectionSort.doubleSelectionSort(doubleArr100000a);
        System.out.print("double Selection sort 500000 (US) : ");
        double [] doubleArr500000ss = SelectionSort.doubleSelectionSort(doubleArr500000a);

        //sorted double Selection sort
        System.out.println("Selection Sort (Sorted): ");
        System.out.print("double Selection sort 10 (S) : ");
        SelectionSort.doubleSelectionSort(doubleArr10ss);
        System.out.print("double Selection sort 100 (S) : ");
        SelectionSort.doubleSelectionSort(doubleArr100ss);
        System.out.print("double Selection sort 1000 (S) : ");
        SelectionSort.doubleSelectionSort(doubleArr1000ss);
        System.out.print("double Selection sort 10000 (S) : ");
        SelectionSort.doubleSelectionSort(doubleArr10000ss);
        System.out.print("double Selection sort 50000 (S) : ");
        SelectionSort.doubleSelectionSort(doubleArr50000ss);
        System.out.print("double Selection sort 100000 (S) : ");
        SelectionSort.doubleSelectionSort(doubleArr100000ss);
        System.out.print("double Selection sort 500000 (S) : ");
        SelectionSort.doubleSelectionSort(doubleArr500000ss);
        
        //unsorted double heap sort
        System.out.println("Heap Sort (Unsorted): ");
        System.out.print("double Heap sort 10 (US) : ");
        double [] doubleArr10hs = HeapSort.doubleHeapSort(doubleArr10a);
        System.out.print("double Heap sort 100 (US) : ");
        double [] doubleArr100hs = HeapSort.doubleHeapSort(doubleArr100a);
        System.out.print("double Heap sort 1000 (US) : ");
        double [] doubleArr1000hs = HeapSort.doubleHeapSort(doubleArr1000a);
        System.out.print("double Heap sort 10000 (US) : ");
        double [] doubleArr10000hs = HeapSort.doubleHeapSort(doubleArr10000a);
        System.out.print("double Heap sort 50000 (US) : ");
        double [] doubleArr50000hs = HeapSort.doubleHeapSort(doubleArr50000a);
        System.out.print("double Heap sort 100000 (US) : ");
        double [] doubleArr100000hs = HeapSort.doubleHeapSort(doubleArr100000a);
        System.out.print("double Heap sort 500000 (US) : ");
        double [] doubleArr500000hs = HeapSort.doubleHeapSort(doubleArr500000a);

        //sorted double Heap sort
        System.out.println("Heap Sort (Sorted): ");
        System.out.print("double Heap sort 10 (S) : ");
        HeapSort.doubleHeapSort(doubleArr10hs);
        System.out.print("double Heap sort 100 (S) : ");
        HeapSort.doubleHeapSort(doubleArr100hs);
        System.out.print("double Heap sort 1000 (S) : ");
        HeapSort.doubleHeapSort(doubleArr1000hs);
        System.out.print("double Heap sort 10000 (S) : ");
        HeapSort.doubleHeapSort(doubleArr10000hs);
        System.out.print("double Heap sort 50000 (S) : ");
        HeapSort.doubleHeapSort(doubleArr50000hs);
        System.out.print("double Heap sort 100000 (S) : ");
        HeapSort.doubleHeapSort(doubleArr100000hs);
        System.out.print("double Heap sort 500000 (S) : ");
        HeapSort.doubleHeapSort(doubleArr500000hs);

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
        
        for (int size : sizes) {
            System.out.println("Timing for size: " + size);

            // Generate and shuffle arrays using arrCreator methods
            int[] intArray = arrCreator.intArrR(size);
            double[] doubleArray = arrCreator.doubleArrR(size);
            String[] stringArray = arrCreator.stringArrR(size);

            // Sort and time sorting for unsorted arrays
            FinalSorting.timeSorting(intArray, "Integer (Unsorted)", "ShellSort");
            FinalSorting.timeSorting(doubleArray, "Double (Unsorted)", "ShellSort");
            FinalSorting.timeSorting(stringArray, "String (Unsorted)", "ShellSort");

            // Sort arrays again to test timing on already sorted arrays
            Arrays.sort(intArray);
            Arrays.sort(doubleArray);
            Arrays.sort(stringArray);

            FinalSorting.timeSorting(intArray, "Integer (Sorted)", "ShellSort");
            FinalSorting.timeSorting(doubleArray, "Double (Sorted)", "ShellSort");
            FinalSorting.timeSorting(stringArray, "String (Sorted)", "ShellSort");

            // Timing RadixSort for Integer array (unsorted and sorted)
            FinalSorting.timeSorting(intArray, "Integer (Unsorted)", "RadixSort");
            Arrays.sort(intArray);
            FinalSorting.timeSorting(intArray, "Integer (Sorted)", "RadixSort");
    
            FinalSorting.timeSorting(doubleArray, "Double (Unsorted)", "RadixSort");
            Arrays.sort(doubleArray);
            FinalSorting.timeSorting(doubleArray, "Double (Sorted)", "RadixSort");
    
            FinalSorting.timeSorting(stringArray, "String (Unsorted)", "RadixSort");
            Arrays.sort(stringArray);
            FinalSorting.timeSorting(stringArray, "String (Sorted)", "RadixSort");
    
            intArray = arrCreator.intArrR(size);
            doubleArray = arrCreator.doubleArrR(size);
            stringArray = arrCreator.stringArrR(size);
    
            FinalSorting.timeSorting(intArray, "Integer (Unsorted)", "MergeSort");
            Arrays.sort(intArray);
            FinalSorting.timeSorting(intArray, "Integer (Sorted)", "MergeSort");
    
            FinalSorting.timeSorting(doubleArray, "Double (Unsorted)", "MergeSort");
            Arrays.sort(doubleArray);
            FinalSorting.timeSorting(doubleArray, "Double (Sorted)", "MergeSort");
    
            FinalSorting.timeSorting(stringArray, "String (Unsorted)", "MergeSort");
            Arrays.sort(stringArray);
            FinalSorting.timeSorting(stringArray, "String (Sorted)", "MergeSort");
        }
    }
}
