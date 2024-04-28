import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenericRadixSort {
    private static final int[] SIZES = {10, 100, 1000, 10000, 50000, 100000, 500000};
    private static final Random random = new Random();

    public static void main(String[] args) {
        for (int size : SIZES) {
            System.out.println("Timing for size: " + size);
            Integer[] intArray = generateSequentialIntegers(size);
            Double[] doubleArray = generateSequentialDoubles(size);
            String[] stringArray = generateSequentialStrings(size);

            // Sort and time integers
            timeSorting(intArray, "Integer");

            // Sort and time doubles
            timeSortingDoubles(doubleArray, "Double");

            // Sort and time strings
            timeSortingStrings(stringArray, "String");
        }
    }

    private static void timeSorting(Integer[] array, String description) {
        // Unsorted timing
        shuffleArray(array);
        long startTime = System.nanoTime();
        radixSortIntegers(array);
        long endTime = System.nanoTime();
        System.out.println(description + " Unsorted array took: " + (endTime - startTime) + " ns");

        // Sorted timing
        startTime = System.nanoTime();
        radixSortIntegers(array);  // Array is already sorted
        endTime = System.nanoTime();
        System.out.println(description + " Sorted array took: " + (endTime - startTime) + " ns");
    }

    private static void timeSortingDoubles(Double[] array, String description) {
        // Unsorted timing
        shuffleArray(array);
        long startTime = System.nanoTime();
        radixSortDoubles(array);
        long endTime = System.nanoTime();
        System.out.println(description + " Unsorted array took: " + (endTime - startTime) + " ns");

        // Sorted timing
        startTime = System.nanoTime();
        radixSortDoubles(array);  // Array is already sorted
        endTime = System.nanoTime();
        System.out.println(description + " Sorted array took: " + (endTime - startTime) + " ns");
    }

    private static void timeSortingStrings(String[] array, String description) {
        // Unsorted timing
        shuffleArray(array);
        long startTime = System.nanoTime();
        radixSortStrings(array);
        long endTime = System.nanoTime();
        System.out.println(description + " Unsorted array took: " + (endTime - startTime) + " ns");

        // Sorted timing
        startTime = System.nanoTime();
        radixSortStrings(array);  // Array is already sorted
        endTime = System.nanoTime();
        System.out.println(description + " Sorted array took: " + (endTime - startTime) + " ns");
    }

    public static void radixSortIntegers(Integer[] array) {
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

    public static void radixSortDoubles(Double[] array) {
        // This method assumes the doubles are non-negative and scales them up
        // This is a placeholder; actual implementation may need to consider more factors
        final long SCALING_FACTOR = 1000000L; // Example scaling factor
        Long[] temp = new Long[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = (long) (array[i] * SCALING_FACTOR);
        }
        radixSortLongs(temp);
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i] / (double) SCALING_FACTOR;
        }
    }

    public static void radixSortStrings(String[] array) {
        final int R = 256;  // Extended ASCII character set
        int W = 0;  // Maximum string length
        for (String s : array) {
            W = Math.max(W, s.length());
        }
        String[] aux = new String[array.length];
    
        for (int d = W-1; d >= 0; d--) {
            int[] count = new int[R+1];
    
            // Compute frequency counts
            for (int i = 0; i < array.length; i++) {
                int c = d < array[i].length() ? array[i].charAt(d) : 0; // Use 0 for padding shorter strings
                count[c + 1]++;
            }
    
            // Transform counts to indices
            for (int r = 0; r < R; r++)
                count[r + 1] += count[r];
    
            // Distribute
            for (int i = 0; i < array.length; i++) {
                int c = d < array[i].length() ? array[i].charAt(d) : 0; // Use 0 for padding shorter strings
                aux[count[c]++] = array[i];
            }
    
            // Copy back
            for (int i = 0; i < array.length; i++)
                array[i] = aux[i];
        }
    }    

    private static void radixSortLongs(Long[] array) {
        // Similar to radixSortIntegers, but for Longs
        final int RADIX = 10;
        List<Long>[] bucket = new ArrayList[RADIX];
        for (int i = 0; i < RADIX; i++) {
            bucket[i] = new ArrayList<>();
        }

        boolean maxLength = false;
        long tmp = -1, placement = 1;
        while (!maxLength) {
            maxLength = true;
            for (Long i : array) {
                tmp = i / placement;
                bucket[(int)(tmp % RADIX)].add(i);
                if (maxLength && tmp > 0) {
                    maxLength = false;
                }
            }

            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (Long i : bucket[b]) {
                    array[a++] = i;
                }
                bucket[b].clear();
            }
            placement *= RADIX;
        }
    }

    private static Integer[] generateSequentialIntegers(int size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    private static Double[] generateSequentialDoubles(int size) {
        Double[] array = new Double[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1.0;
        }
        return array;
    }

    private static String[] generateSequentialStrings(int size) {
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = String.format("String %d", i + 1);
        }
        return array;
    }

    private static void shuffleArray(Integer[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    private static void shuffleArray(Double[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            double a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    private static void shuffleArray(String[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            String a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }
}
