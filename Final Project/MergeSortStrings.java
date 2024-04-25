public class MergeSortStrings {
    public static void sort(String[] array) {
        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;
        String[] left = new String[mid];
        String[] right = new String[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        sort(left);
        sort(right);

        merge(array, left, right);
    }

    private static void merge(String[] result, String[] left, String[] right) {
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
        String[] stringArray = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        sort(stringArray);
        for (String value : stringArray) {
            System.out.print(value + " ");
        }
    }
}
