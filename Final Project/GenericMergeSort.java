import java.util.Random;

public class GenericMergeSort {

    // Generic Merge Sort method
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

    // Generic merge function
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

    // Test and time sorting for various data types and sizes
    public static void main(String[] args) {
        int[] sizes = {10, 100, 1000, 10000, 50000, 100000, 500000};

        for (int size : sizes) {
            Integer[] intArray = generateSequentialIntegers(size);
            Double[] doubleArray = generateSequentialDoubles(size);
            String[] stringArray = generateSequentialStrings(size);

            System.out.println("Timing for size: " + size);

            long startTime = System.nanoTime();
            sort(intArray);
            long endTime = System.nanoTime();
            System.out.println("Integer array took: " + (endTime - startTime) + " ns");

            startTime = System.nanoTime();
            sort(doubleArray);
            endTime = System.nanoTime();
            System.out.println("Double array took: " + (endTime - startTime) + " ns");

            startTime = System.nanoTime();
            sort(stringArray);
            endTime = System.nanoTime();
            System.out.println("String array took: " + (endTime - startTime) + " ns");
        }

        for (int size : sizes) {
            System.out.println("Timing for size: " + size);

        Integer[] intArray = generateRandomIntegers(size);
        Double[] doubleArray = generateRandomDoubles(size);
        String[] stringArray = generateRandomStrings(size);

        // Timing Integer Sort
        long startTime = System.nanoTime();
        sort(intArray);
        long endTime = System.nanoTime();
        System.out.println("Random Integer array took: " + (endTime - startTime) + " ns");

        // Timing Double Sort
        startTime = System.nanoTime();
        sort(doubleArray);
        endTime = System.nanoTime();
        System.out.println("Random Double array took: " + (endTime - startTime) + " ns");

        // Timing String Sort
        startTime = System.nanoTime();
        sort(stringArray);
        endTime = System.nanoTime();
        System.out.println("Random String array took: " + (endTime - startTime) + " ns");
        }
    }

    // Helper methods to generate data
    public static Integer[] generateSequentialIntegers(int size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static Double[] generateSequentialDoubles(int size) {
        Double[] array = new Double[size];
        for (int i = 0; i < size; i++) {
            array[i] = (double) (i + 1);
        }
        return array;
    }

    public static String[] generateSequentialStrings(int size) {
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = "Number" + (i + 1);
        }
        return array;
    }

    public static Integer[] generateRandomIntegers(int size) {
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size * 10); 
        }
        return array;
    }
    
    public static Double[] generateRandomDoubles(int size) {
        Random random = new Random();
        Double[] array = new Double[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble() * size * 10; // scale by an arbitrary number to vary the range
        }
        return array;
    }
    
    public static String[] generateRandomStrings(int size) {
        Random random = new Random();
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = "String" + random.nextInt(size * 10);
        }
        return array;
    }
}