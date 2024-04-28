import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortedRadixSortTiming {
    private static final int[] SIZES = {10, 100, 1000, 10000, 50000, 100000, 500000};
    private static final int TRIALS = 10;

    public static void main(String[] args) {
        for (int size : SIZES) {
            System.out.println("Size: " + size);
            long[] times = new long[TRIALS];

            for (int trial = 0; trial < TRIALS; trial++) {
                Integer[] array = generateRandomArray(size);
                RadixSort.sort(array); // Sort once to get a sorted array

                long startTime = System.nanoTime();
                RadixSort.sort(array); // Time sorting the sorted array
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
            array[i] = random.nextInt(100000); // Suitable for Radix Sort
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

class RadixSort {
    public static void sort(Integer[] array) {
        final int RADIX = 10;
        List<Integer>[] bucket = new ArrayList[RADIX];
        for (int i = 0; i < RADIX; i++) {
            bucket[i] = new ArrayList<>();
        }

        boolean maxLength = false;
        int tmp = -1, placement = 1;
        while (!maxLength) {
            maxLength = true;
            for (Integer i : array) {
                tmp = i / placement;
                bucket[tmp % RADIX].add(i);
                if (maxLength && tmp > 0) {
                    maxLength = false;
                }
            }

            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (Integer i : bucket[b]) {
                    array[a++] = i;
                }
                bucket[b].clear();
            }
            placement *= RADIX;
        }
    }
}
