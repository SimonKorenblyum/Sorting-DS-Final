public class FinalProject
{
    public static void main(String[] args) 
    {
        //int selecton sort
        int [] iArr1a = arrCreator.intArrR(10);
        System.out.println("int selection sort");
        int [] iArr1b =SelectionSort.intSelectionSort(iArr1a);
        for(int i = 0; i < 10; i++)
        {
            System.out.print(iArr1b[i] + "  ");
        }
        System.out.println("\n\n");
        
        //int bubble sort
        int [] iArr2a = arrCreator.intArrR(10);
        System.out.println("int bubble sort");
        int [] iArr2b = BubbleSort.intBubbleSort(iArr2a);
        for(int i = 0; i < 10; i++)
        {
            System.out.print(iArr2b[i] + "  ");
        }
        System.out.println("\n\n");

        //intHeapSort
        int [] iArr3a = arrCreator.intArrR(10);
        System.out.println("int heap sort");
        int [] iArr3b =HeapSort.intHeapSort(iArr3a);
        for(int i = 0; i < 10; i++)
        {
            System.out.print(iArr3b[i] + "  ");
        }
        System.out.println("\n\n");

        //double selection sort
        double [] dArr1a = arrCreator.doubleArrR(10);
        System.out.println("double selection sort");
        double [] dArr1b = SelectionSort.doubleSelectionSort(dArr1a);
        for(int i = 0; i < 10; i++)
        {
            System.out.print(dArr1b[i] + "  ");
        }
        System.out.println("\n\n");
        
        //double bubble sort
        double [] dArr2a = arrCreator.doubleArrR(10);
        System.out.println("double bubble sort");
        double [] dArr2b = BubbleSort.doubleBubbleSort(dArr2a);
        for(int i = 0; i < 10; i++)
        {
            System.out.print(dArr2b[i] + "  ");
        }
        System.out.println("\n\n");

        //double heap sort
        double [] dArr3a = arrCreator.doubleArrR(10);
        System.out.println("double heap sort");
        double [] dArr3b = HeapSort.doubleHeapSort(dArr3a);
        for(int i = 0; i < 10; i++)
        {
            System.out.print(dArr3b[i] + "  ");
        }
        System.out.println("\n\n");

        //String seletion sort
        String [] cArr1a = arrCreator.stringArrR(10);
        System.out.println("string selection sort");
        String [] cArr1b = SelectionSort.stringSelectionSort(cArr1a);
        for(int i = 0; i < 10; i++)
        {
            System.out.print(cArr1b[i] + "  ");
        }
        System.out.println("\n\n");

        //String bubble sort
        String [] cArr2a = arrCreator.stringArrR(10);
        System.out.println("String bubble sort");
        String [] cArr2b = BubbleSort.stringBubbleSort(cArr2a);
        for(int i = 0; i < 10; i++)
        {
            System.out.print(cArr2b[i] + "  ");
        }
        System.out.println("\n\n");

        //string heap sort
        String [] cArr3a = arrCreator.stringArrR(10);
        System.out.println("String heap sort");
        String [] cArr3b = HeapSort.stringHeapSort(cArr3a);
        for(int i = 0; i < 10; i++)
        {
            System.out.print(cArr3b[i] + "  ");
        }
        System.out.println("\n\n");
    }

}
