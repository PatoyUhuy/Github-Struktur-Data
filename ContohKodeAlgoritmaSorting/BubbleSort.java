public class BubbleSort {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};
        System.out.println("Original list (Bubble Sort): " + java.util.Arrays.toString(data));

        BubbleSort bs = new BubbleSort();
        bs.sort(data);

        System.out.println("Sorted list (Bubble Sort): " + java.util.Arrays.toString(data));
        System.out.println("------------------------------");
    }
}