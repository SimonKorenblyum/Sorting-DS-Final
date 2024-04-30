import java.util.Arrays;
import java.util.Random;

public class SortingComparison {
    // Insertion Sort implementation for int arrays
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    // Quick Sort implementation for int arrays
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    // Insertion Sort implementation for double arrays
    public static void insertionSort(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    // Quick Sort implementation for double arrays
    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    // Insertion Sort implementation for String arrays
    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    // Quick Sort implementation for String arrays
    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    // Method to generate random int arrays
    public static int[] generateRandomIntArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt();
        }
        return arr;
    }
    // Method to generate random double arrays
    public static double[] generateRandomDoubleArray(int size) {
        double[] arr = new double[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextDouble();
        }
        return arr;
    }
    // Method to generate random String arrays
    public static String[] generateRandomStringArray(int size) {
        String[] arr = new String[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            byte[] bytes = new byte[5];
            rand.nextBytes(bytes);
            arr[i] = new String(bytes);
        }
        return arr;
    }
    // Method to measure execution time of sorting algorithms for int arrays
    public static long measureExecutionTime(int[] arr, String algorithm) {
        long startTime = System.nanoTime();
        switch (algorithm) {
            case "InsertionSort":
                insertionSort(arr.clone());
                break;
            case "QuickSort":
                quickSort(arr.clone(), 0, arr.length - 1);
                break;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    // Method to measure execution time of sorting algorithms for double arrays
    public static long measureExecutionTime(double[] arr, String algorithm) {
        long startTime = System.nanoTime();
        switch (algorithm) {
            case "InsertionSort":
                insertionSort(arr.clone());
                break;
            case "QuickSort":
                quickSort(arr.clone(), 0, arr.length - 1);
                break;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    // Method to measure execution time of sorting algorithms for String arrays
    public static long measureExecutionTime(String[] arr, String algorithm) {
        long startTime = System.nanoTime();
        switch (algorithm) {
            case "InsertionSort":
                insertionSort(arr.clone());
                break;
            case "QuickSort":
                quickSort(arr.clone(), 0, arr.length - 1);
                break;
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public static void main(String[] args) {
        int[] sizes = { 10, 100, 1000, 10000, 50000, 100000, 500000 };
        String[] algorithms = { "InsertionSort", "QuickSort" };

        // Store timing data for each algorithm, size, and data type
        long[][][] timingData = new long[algorithms.length][sizes.length][3]; // [algorithm][size][min, avg, max]

        // Perform measurements for int arrays
        for (int i = 0; i < algorithms.length; i++) {
            for (int j = 0; j < sizes.length; j++) {
                long[] times = new long[5]; // 5 observations
                for (int k = 0; k < 5; k++) {
                    int[] arr = generateRandomIntArray(sizes[j]);
                    times[k] = measureExecutionTime(arr, algorithms[i]);
                }
                Arrays.sort(times);
                timingData[i][j][0] = times[0];
                long sum = 0;
                for (long time : times) {
                    sum += time;
                }
                timingData[i][j][1] = sum / times.length;
                timingData[i][j][2] = times[4];
            }
        }

        // Perform measurements for double arrays
        for (int i = 0; i < algorithms.length; i++) {
            for (int j = 0; j < sizes.length; j++) {
                long[] times = new long[5]; // 5 observations
                for (int k = 0; k < 5; k++) {
                    double[] arr = generateRandomDoubleArray(sizes[j]);
                    times[k] = measureExecutionTime(arr, algorithms[i]);
                }
                Arrays.sort(times);
                timingData[i][j][0] = times[0];
                long sum = 0;
                for (long time : times) {
                    sum += time;
                }
                timingData[i][j][1] = sum / times.length;
                timingData[i][j][2] = times[4];
            }
        }

        // Perform measurements for String arrays
        for (int i = 0; i < algorithms.length; i++) {
            for (int j = 0; j < sizes.length; j++) {
                long[] times = new long[5]; // 5 observations
                for (int k = 0; k < 5; k++) {
                    String[] arr = generateRandomStringArray(sizes[j]);
                    times[k] = measureExecutionTime(arr, algorithms[i]);
                }
                Arrays.sort(times);
                timingData[i][j][0] = times[0];
                long sum = 0;
                for (long time : times) {
                    sum += time;
                }
                timingData[i][j][1] = sum / times.length;
                timingData[i][j][2] = times[4];
            }
        }

        // Print timing data
        System.out.println("Timing Data:");
        for (int i = 0; i < algorithms.length; i++) {
            System.out.println(algorithms[i]);
            System.out.printf("%-10s %-10s %-10s %-10s%n", "Size", "Min", "Avg", "Max");
            for (int j = 0; j < sizes.length; j++) {
                System.out.printf("%-10d %-10d %-10d %-10d%n", sizes[j], timingData[i][j][0], timingData[i][j][1],
                        timingData[i][j][2]);
            }
            System.out.println();
        }
    }

}
