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
        int [] intArr10b = BubbleSort.intBubbleSort(intArr10a);
        System.out.print("Int bubble sort 100 (US) : ");
        int [] intArr100b = BubbleSort.intBubbleSort(intArr100a);
        System.out.print("Int bubble sort 1000 (US) : ");
        int [] intArr1000b = BubbleSort.intBubbleSort(intArr1000a);
        System.out.print("Int bubble sort 10000 (US) : ");
        int [] intArr10000b = BubbleSort.intBubbleSort(intArr10000a);
        System.out.print("Int bubble sort 50000 (US) : ");
        int [] intArr50000b = BubbleSort.intBubbleSort(intArr50000a);
        System.out.print("Int bubble sort 100000 (US) : ");
        int [] intArr100000b = BubbleSort.intBubbleSort(intArr100000a);
        System.out.print("Int bubble sort 500000 (US) : ");
        int [] intArr500000b = BubbleSort.intBubbleSort(intArr500000a);

        //sorted int bubble sort
        System.out.println("Bubble Sort (Unsorted): ");
        System.out.print("Int bubble sort 10 (S) : ");
        BubbleSort.intBubbleSort(intArr10b);
        System.out.print("Int bubble sort 100 (S) : ");
        BubbleSort.intBubbleSort(intArr100b);
        System.out.print("Int bubble sort 1000 (S) : ");
        BubbleSort.intBubbleSort(intArr1000b);
        System.out.print("Int bubble sort 10000 (S) : ");
        BubbleSort.intBubbleSort(intArr10000b);
        System.out.print("Int bubble sort 50000 (S) : ");
        BubbleSort.intBubbleSort(intArr50000b);
        System.out.print("Int bubble sort 100000 (S) : ");
        BubbleSort.intBubbleSort(intArr100000b);
        System.out.print("Int bubble sort 500000 (S) : ");
        BubbleSort.intBubbleSort(intArr500000b);
        

    }

}
