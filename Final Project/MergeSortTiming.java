import java.util.Random;

public class MergeSortTiming {
    // Constants for the sizes and number of trials
    private static final int[] SIZES = {10, 100, 1000, 10000, 50000, 100000, 500000};
    private static final int TRIALS = 10;

    public static void main(String[] args) {
        for (int size : SIZES) {
            System.out.println("Size: " + size);
            long[] times = new long[TRIALS];  // To store timing data for each trial

            for (int trial = 0; trial < TRIALS; trial++) {
                Integer[] array = generateRandomArray(size);
                long startTime = System.nanoTime();
                MergeSortIntegers.sort(array);
                long endTime = System.nanoTime();
                times[trial] = endTime - startTime;
            }

            printStatistics(times);
        }
    }

    // Generates an array of random Integers
    private static Integer[] generateRandomArray(int size) {
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    // Print statistics: min, average, and max times
    private static void printStatistics(long[] times) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long sum = 0;

        for (long time : times) {
            if (time < min) min = time;
            if (time > max) max = time;
            sum += time;
        }
        double avg = (double) sum / times.length;

        System.out.printf("Min: %d ns, Avg: %.2f ns, Max: %d ns\n", min, avg, max);
    }
}

class MergeSortIntegers {
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
}
