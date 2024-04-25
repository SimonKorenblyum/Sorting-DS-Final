import java.util.ArrayList;
import java.util.List;

public class RadixSortStrings {
    public static void sort(String[] array) {
        final int MAX_LEN = 256;
        List<String>[] bucket = new ArrayList[MAX_LEN];
        for (int i = 0; i < MAX_LEN; i++) {
            bucket[i] = new ArrayList<>();
        }

        int maxLength = 0;
        for (String s : array) {
            maxLength = Math.max(maxLength, s.length());
        }

        for (int index = maxLength - 1; index >= 0; index--) {
            for (String s : array) {
                int charIndex = index < s.length() ? s.charAt(index) : 0;
                bucket[charIndex].add(s);
            }

            int pos = 0;
            for (int i = 0; i < MAX_LEN; i++) {
                for (String s : bucket[i]) {
                    array[pos++] = s;
                }
                bucket[i].clear();
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
        sort(arr);
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
