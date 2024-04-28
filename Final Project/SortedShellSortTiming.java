import java.util.Random;

public class SortedShellSortTiming {
    private static final int[] SIZES = {10, 100, 1000, 10000, 50000, 100000, 500000};
    private static final int TRIALS = 10;

    public static void main(String[] args) {
        for (int size : SIZES) {
            System.out.println("Size: " + size);
            long[] times = new long[TRIALS];

            for (int trial = 0; trial < TRIALS; trial++) {
                Integer[] array = generateRandomArray(size);
                ShellSort.sort(array); // Sort once to get a sorted array

                long startTime = System.nanoTime();
                ShellSort.sort(array); // Time sorting the sorted array
                long endTime = System.nanoTime();
                times[trial] = endTime - startTime;
            }

            printStatistics(times);
        }
    }

    private static Integer[] generateRandomArray(int size) {
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

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

class ShellSort {
    public static void sort(Integer[] array) {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }
}
