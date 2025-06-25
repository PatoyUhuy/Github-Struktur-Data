public class CountingSort {
    public void sort(int[] arr) {
        int n = arr.length;

        // The output array that will have sorted arr
        int[] output = new int[n];

        // Find the maximum and minimum element of the input array
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int range = max - min + 1;

        // Create a count array to store count of individual
        // characters and initialize count array as 0
        int[] count = new int[range];
        for (int i = 0; i < range; ++i) {
            count[i] = 0;
        }

        // Store count of each character
        for (int i = 0; i < n; i++) {
            count[arr[i] - min]++;
        }

        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};
        System.out.println("Original list (Counting Sort): " + java.util.Arrays.toString(data));

        CountingSort cs = new CountingSort();
        cs.sort(data);

        System.out.println("Sorted list (Counting Sort): " + java.util.Arrays.toString(data));
        System.out.println("------------------------------");
    }
}
