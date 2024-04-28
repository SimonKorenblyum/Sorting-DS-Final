import java.util.Random;
import java.util.Arrays;

public class GenericShellSort {
    public static void sort(int[] array) {
        shellSort(array);
    }

    public static void sort(double[] array) {
        shellSort(array);
    }

    public static void sort(String[] array) {
        shellSort(array);
    }

    private static void shellSort(int[] array) {
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

    private static void shellSort(double[] array) {
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

    private static void shellSort(String[] array) {
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
        testSorting();
    }

    private static void testSorting() {
        int[] sizes = {10, 100, 1000, 10000, 50000, 100000, 500000};
        Random random = new Random();
        for (int size : sizes) {
            System.out.println("Timing for size: " + size);

            int[] intArray = generateSequentialIntegers(size);
            double[] doubleArray = generateSequentialDoubles(size);
            String[] stringArray = generateSequentialStrings(size);

            // Shuffle arrays to create unsorted versions
            shuffleArray(intArray, random);
            shuffleArray(doubleArray, random);
            shuffleArray(stringArray, random);

            // Timing for unsorted arrays
            timeSorting(intArray, "Integer (Unsorted)");
            timeSorting(doubleArray, "Double (Unsorted)");
            timeSorting(stringArray, "String (Unsorted)");

            // Re-sort arrays to make them sorted
            Arrays.sort(intArray);
            Arrays.sort(doubleArray);
            Arrays.sort(stringArray, null);

            // Timing for sorted arrays
            timeSorting(intArray, "Integer (Sorted)");
            timeSorting(doubleArray, "Double (Sorted)");
            timeSorting(stringArray, "String (Sorted)");
        }
    }

    private static void timeSorting(int[] array, String description) {
        long startTime = System.nanoTime();
        sort(array);
        long endTime = System.nanoTime();
        System.out.println(description + " array took: " + (endTime - startTime) + " ns");
    }

    private static void timeSorting(double[] array, String description) {
        long startTime = System.nanoTime();
        sort(array);
        long endTime = System.nanoTime();
        System.out.println(description + " array took: " + (endTime - startTime) + " ns");
    }

    private static void timeSorting(String[] array, String description) {
        long startTime = System.nanoTime();
        sort(array);
        long endTime = System.nanoTime();
        System.out.println(description + " array took: " + (endTime - startTime) + " ns");
    }

    private static void shuffleArray(int[] array, Random random) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    private static void shuffleArray(double[] array, Random random) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            double a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    private static void shuffleArray(String[] array, Random random) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            String a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    private static int[] generateSequentialIntegers(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    private static double[] generateSequentialDoubles(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1.0;
        }
        return array;
    }

    private static String[] generateSequentialStrings(int size) {
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = "String " + (i + 1);
        }
        return array;
    }
}
