public class MergeSort {
    public static void sort(Integer[] array) {
        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;
        Integer[] left = new Integer[mid];
        Integer[] right = new Integer[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        sort(left);
        sort(right);

        merge(array, left, right);
    }

    private static void merge(Integer[] result, Integer[] left, Integer[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {170, 45, 75, 90, 802, 24, 2, 66};
        sort(intArray);
        for (Integer value : intArray) {
            System.out.print(value + " ");
        }
    }
}
