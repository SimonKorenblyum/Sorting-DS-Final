public class ShellSortDoubles {
    public static void sort(double[] array) {
        int n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                double temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        double[] arr = {9.0, 8.1, 3.4, 7.2, 5.5, 6.6, 4.7, 1.3};
        sort(arr);
        for (double value : arr) {
            System.out.print(value + " ");
        }
    }
}