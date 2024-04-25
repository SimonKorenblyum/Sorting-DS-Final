public class MergeSortDoubles {
    public static void sort(Double[] array) {
        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;
        Double[] left = new Double[mid];
        Double[] right = new Double[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        sort(left);
        sort(right);

        merge(array, left, right);
    }

    private static void merge(Double[] result, Double[] left, Double[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
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
        Double[] doubleArray = {34.4, 23.9, 42.1, 56.2, 1.7, 92.5, 0.2, 8.3};
        sort(doubleArray);
        for (Double value : doubleArray) {
            System.out.print(value + " ");
        }
    }
}
