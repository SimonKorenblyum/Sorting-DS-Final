public class FinalProject
{
    public static void main(String[] args) 
    {
        //int selecton sort
        int [] iArr1a = new int [4];
        iArr1a[0] = 2;
        iArr1a[1] = 1;
        iArr1a[2] = 4;
        iArr1a[3] = 3;
        System.out.println("int selection sort");
        int [] iArr1b =SelectionSort.intSelectionSort(iArr1a);
        for(int i = 0; i < 4; i++)
        {
            System.out.print(iArr1b[i] + "  ");
        }
        System.out.println("\n\n");
        
        //int bubble sort
        int [] iArr2a = new int [4];
        iArr2a[0] = 2;
        iArr2a[1] = 1;
        iArr2a[2] = 4;
        iArr2a[3] = 3;
        System.out.println("int bubble sort");
        int [] iArr2b = BubbleSort.intBubbleSort(iArr2a);
        for(int i = 0; i < 4; i++)
        {
            System.out.print(iArr2b[i] + "  ");
        }
        System.out.println("\n\n");

        //intHeapSort
        int [] iArr3a = new int [4];
        iArr3a[0] = 2;
        iArr3a[1] = 1;
        iArr3a[2] = 4;
        iArr3a[3] = 3;
        System.out.println("int heap sort");
        int [] iArr3b =HeapSort.intHeapSort(iArr3a);
        for(int i = 0; i < 4; i++)
        {
            System.out.print(iArr3b[i] + "  ");
        }
        System.out.println("\n\n");

        //double selection sort
        double [] dArr1a = new double [4];
        dArr1a[0] = 1.2;
        dArr1a[1] = 1.1;
        dArr1a[2] = 1.4;
        dArr1a[3] = 1.3;
        System.out.println("double selection sort");
        double [] dArr1b = SelectionSort.doubleSelectionSort(dArr1a);
        for(int i = 0; i < 4; i++)
        {
            System.out.print(dArr1b[i] + "  ");
        }
        System.out.println("\n\n");
        
        //double bubble sort
        double [] dArr2a = new double [4];
        dArr2a[0] = 1.2;
        dArr2a[1] = 1.1;
        dArr2a[2] = 1.4;
        dArr2a[3] = 1.3;
        System.out.println("double bubble sort");
        double [] dArr2b = BubbleSort.doubleBubbleSort(dArr2a);
        for(int i = 0; i < 4; i++)
        {
            System.out.print(dArr2b[i] + "  ");
        }
        System.out.println("\n\n");

        //double heap sort
        double [] dArr3a = new double [4];
        dArr3a[0] = 1.2;
        dArr3a[1] = 1.1;
        dArr3a[2] = 1.4;
        dArr3a[3] = 1.3;
        System.out.println("double heap sort");
        double [] dArr3b = HeapSort.doubleHeapSort(dArr3a);
        for(int i = 0; i < 4; i++)
        {
            System.out.print(dArr3b[i] + "  ");
        }
        System.out.println("\n\n");

        //String seletion sort
        String [] cArr1a = new String [4];
        cArr1a[0] = "b";
        cArr1a[1] = "d";
        cArr1a[2] = "a";
        cArr1a[3] = "c";
        System.out.println("char selection sort");
        String [] cArr1b = SelectionSort.stringSelectionSort(cArr1a);
        for(int i = 0; i < 4; i++)
        {
            System.out.print(cArr1b[i] + "  ");
        }
        System.out.println("\n\n");

        //String bubble sort
        String [] cArr2a = new String [4];
        cArr2a[0] = "b";
        cArr2a[1] = "d";
        cArr2a[2] = "a";
        cArr2a[3] = "c";
        System.out.println("String bubble sort");
        String [] cArr2b = BubbleSort.stringBubbleSort(cArr2a);
        for(int i = 0; i < 4; i++)
        {
            System.out.print(cArr2b[i] + "  ");
        }
        System.out.println("\n\n");

        //string heap sort
        String [] cArr3a = new String [4];
        cArr3a[0] = "b";
        cArr3a[1] = "d";
        cArr3a[2] = "a";
        cArr3a[3] = "c";
        System.out.println("String heap sort");
        String [] cArr3b = HeapSort.stringHeapSort(cArr3a);
        for(int i = 0; i < 4; i++)
        {
            System.out.print(cArr3b[i] + "  ");
        }
        System.out.println("\n\n");
    }

}
