public class SelectionSort {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};
        System.out.println("Original list (Selection Sort): " + java.util.Arrays.toString(data));

        SelectionSort ss = new SelectionSort();
        ss.sort(data);

        System.out.println("Sorted list (Selection Sort): " + java.util.Arrays.toString(data));
        System.out.println("------------------------------");
    }
}
