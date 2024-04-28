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
        int [] iArr1b =intSelectionSort.intSelectionSort(iArr1a);
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
        int [] iArr2b = intBubbleSort.intBubbleSort(iArr2a);
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
        int [] iArr3b =intHeapSort.intHeapSort(iArr3a);
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
        double [] dArr1b = doubleSelectionSort.doubleSelectionSort(dArr1a);
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
        double [] dArr2b = doubleBubbleSort.doubleBubbleSort(dArr2a);
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
        double [] dArr3b = doubleHeapSort.doubleHeapSort(dArr3a);
        for(int i = 0; i < 4; i++)
        {
            System.out.print(dArr3b[i] + "  ");
        }
        System.out.println("\n\n");

        //char seletion sort
        char [] cArr1a = new char [4];
        cArr1a[0] = 'b';
        cArr1a[1] = 'd';
        cArr1a[2] = 'a';
        cArr1a[3] = 'c';
        System.out.println("char selection sort");
        char [] cArr1b = charSelectionSort.charSelectionSort(cArr1a);
        for(int i = 0; i < 4; i++)
        {
            System.out.print(cArr1b[i] + "  ");
        }
        System.out.println("\n\n");

        //char bubble sort
        char [] cArr2a = new char [4];
        cArr2a[0] = 'b';
        cArr2a[1] = 'd';
        cArr2a[2] = 'a';
        cArr2a[3] = 'c';
        System.out.println("char bubble sort");
        char [] cArr2b = charBubbleSort.charBubbleSort(cArr2a);
        for(int i = 0; i < 4; i++)
        {
            System.out.print(cArr2b[i] + "  ");
        }
        System.out.println("\n\n");

        //char heap sort
        char [] cArr3a = new char [4];
        cArr3a[0] = 'b';
        cArr3a[1] = 'd';
        cArr3a[2] = 'a';
        cArr3a[3] = 'c';
        System.out.println("char bubble sort");
        char [] cArr3b = charHeapSort.charHeapSort(cArr2a);
        for(int i = 0; i < 4; i++)
        {
            System.out.print(cArr3b[i] + "  ");
        }
        System.out.println("\n\n");
    }

}
