public class ShellSortStrings {
    public static void sort(String[] array) {
        int n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                String temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap].compareTo(temp) > 0; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
        sort(arr);
        for (String value : arr) {
            System.out.print(value + " ");
        }
    }
}