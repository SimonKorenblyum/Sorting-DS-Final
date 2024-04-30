import java.util.*;

public class FinalSorting {
    
    public static void main(String[] args) {
        int[] sizes = {10, 100, 1000, 10000, 50000, 100000, 500000};
    
        for (int size : sizes) {
            System.out.println("Timing for size: " + size);
    
            // Generate and shuffle arrays using arrCreator methods
            int[] intArray = arrCreator.intArrR(size);
            double[] doubleArray = arrCreator.doubleArrR(size);
            String[] stringArray = arrCreator.stringArrR(size);
    
            // Sort and time sorting for unsorted arrays
            timeSorting(intArray, "Integer (Unsorted)", "ShellSort");
            timeSorting(doubleArray, "Double (Unsorted)", "ShellSort");
            timeSorting(stringArray, "String (Unsorted)", "ShellSort");
    
            timeSorting(intArray, "Integer (Unsorted)", "RadixSort");
            timeSorting(intArray, "Integer (Unsorted)", "MergeSort");
    
            // Sort arrays again to test timing on already sorted arrays
            Arrays.sort(intArray);
            Arrays.sort(doubleArray);
            Arrays.sort(stringArray);
    
            timeSorting(intArray, "Integer (Sorted)", "ShellSort");
            timeSorting(doubleArray, "Double (Sorted)", "ShellSort");
            timeSorting(stringArray, "String (Sorted)", "ShellSort");
    
            timeSorting(intArray, "Integer (Sorted)", "RadixSort");
            timeSorting(intArray, "Integer (Sorted)", "MergeSort");
    
            // Additional implementations for Radix and Merge sorts for double and string types
            timeSorting(doubleArray, "Double (Unsorted)", "RadixSort");
            timeSorting(doubleArray, "Double (Sorted)", "RadixSort");
            timeSorting(stringArray, "String (Unsorted)", "RadixSort");
            timeSorting(stringArray, "String (Sorted)", "RadixSort");
    
            timeSorting(doubleArray, "Double (Unsorted)", "MergeSort");
            timeSorting(doubleArray, "Double (Sorted)", "MergeSort");
            timeSorting(stringArray, "String (Unsorted)", "MergeSort");
            timeSorting(stringArray, "String (Sorted)", "MergeSort");
        }
    }
    
    // ShellSort algorithm implementations
    public static void shellSort(int[] array) {
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

    public static void shellSort(double[] array) {
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

    public static void shellSort(String[] array) {
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

    // RadixSort algorithm implementations
    public static void radixSortIntegers(Integer[] array) {
        final int RADIX = 10;
        List<Integer>[] buckets = new ArrayList[RADIX * 2];  // Increase bucket size to handle negatives separately
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
    
        boolean maxLength = false;
        int tmp, placement = 1;
        while (!maxLength) {
            maxLength = true;
    
            // Place elements into buckets based on their current digit
            for (Integer element : array) {
                tmp = element / placement;
                int bucketIndex = tmp % RADIX + RADIX;  // Shift index to avoid negative indices
                buckets[bucketIndex].add(element);
                if (maxLength && tmp != 0) {
                    maxLength = false;
                }
            }
    
            // Flatten the buckets back into the original array
            int index = 0;
            for (List<Integer> bucket : buckets) {
                for (Integer element : bucket) {
                    array[index++] = element;
                }
                bucket.clear();
            }
            placement *= RADIX;
        }
    }

    public static void radixSortDoubles(Double[] array) {
        final long SCALING_FACTOR = 1000000L;
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
        final int R = 256;
        int W = 0;
        for (String s : array) {
            W = Math.max(W, s.length());
        }
        String[] aux = new String[array.length];

        for (int d = W-1; d >= 0; d--) {
            int[] count = new int[R+1];

            for (int i = 0; i < array.length; i++) {
                int c = d < array[i].length() ? array[i].charAt(d) : 0;
                count[c + 1]++;
            }

            for (int r = 0; r < R; r++)
                count[r + 1] += count[r];

            for (int i = 0; i < array.length; i++) {
                int c = d < array[i].length() ? array[i].charAt(d) : 0;
                aux[count[c]++] = array[i];
            }

            for (int i = 0; i < array.length; i++)
                array[i] = aux[i];
        }
    }

    public static void radixSortLongs(Long[] array) {
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

    // Generic Merge Sort methods
    public static <T extends Comparable<T>> void sort(T[] array) {
        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;
        T[] left = (T[]) new Comparable[mid];
        T[] right = (T[]) new Comparable[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        sort(left);
        sort(right);

        merge(array, left, right);
    }

    public static <T extends Comparable<T>> void merge(T[] result, T[] left, T[] right) {
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

    // Utility methods
    public static int[] generateSequentialIntegers(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static double[] generateSequentialDoubles(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1.0;
        }
        return array;
    }

    public static String[] generateSequentialStrings(int size) {
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = "String " + (i + 1);
        }
        return array;
    }

    public static void shuffleArray(int[] array, Random random) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    public static void shuffleArray(double[] array, Random random) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            double a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    public static void shuffleArray(String[] array, Random random) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            String a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    public static void timeSorting(int[] array, String description, String method) {
        long startTime = System.nanoTime();
        if (method.equals("ShellSort")) {
            shellSort(array);
        } else if (method.equals("RadixSort")) {
            Integer[] boxedArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
            radixSortIntegers(boxedArray);
            array = Arrays.stream(boxedArray).mapToInt(Integer::intValue).toArray();
        } else if (method.equals("MergeSort")) {
            Integer[] boxedArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
            sort(boxedArray);
            array = Arrays.stream(boxedArray).mapToInt(Integer::intValue).toArray();
        }
        long endTime = System.nanoTime();
        System.out.println(description + " using " + method + " took: " + (endTime - startTime) + " ns");
    }

    public static void timeSorting(double[] array, String description, String method) {
        long startTime = System.nanoTime();
        if (method.equals("ShellSort")) {
            shellSort(array);
        }
        long endTime = System.nanoTime();
        System.out.println(description + " using " + method + " took: " + (endTime - startTime) + " ns");
    }

    public static void timeSorting(String[] array, String description, String method) {
        long startTime = System.nanoTime();
        if (method.equals("ShellSort")) {
            shellSort(array);
        }
        long endTime = System.nanoTime();
        System.out.println(description + " using " + method + " took: " + (endTime - startTime) + " ns");
    }

    public static int[] intArrR(int size) {
        int[] arr = new int[size];
        Random rInt = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rInt.nextInt();
        }
        return arr;
    }

    public static double[] doubleArrR(int size) {
        double[] arr = new double[size];
        Random rDouble = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rDouble.nextDouble() * 1000; // Scaling to make numbers more significant
        }
        return arr;
    }

    public static String[] stringArrR(int size) {
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = randomString();
        }
        return arr;
    }

    public static String randomString() {
        String returning = "";
        Random num = new Random();
        for (int i = 0; i < 7; i++) {
            returning += getLetter(num.nextInt(26)); // Fixed to 26 for full alphabet range
        }
        return returning;
    }

    public static char getLetter(int number) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return alphabet.charAt(number);
    }
}
