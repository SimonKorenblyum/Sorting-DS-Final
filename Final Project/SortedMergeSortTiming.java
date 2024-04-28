import java.util.Random;

public class SortedMergeSortTiming {
    private static final int[] SIZES = {10, 100, 1000, 10000, 50000, 100000, 500000};
    private static final int TRIALS = 10;

    public static void main(String[] args) {
        for (int size : SIZES) {
            System.out.println("Size: " + size);
            long[] times = new long[TRIALS];

            for (int trial = 0; trial < TRIALS; trial++) {
                // Generate a random array and sort it initially
                Integer[] array = generateRandomArray(size);
                MergeSortIntegers.sort(array); // Initial sort to make it sorted

                // Measure sorting time on the already sorted array
                long startTime = System.nanoTime();
                MergeSortIntegers.sort(array);
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
