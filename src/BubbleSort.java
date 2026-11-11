public class BubbleSort {

    private void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        System.out.println("\n--- Proses Bubble Sort (Ascending) ---");
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);
            if (!swapped) break;
        }
    }

    public void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        System.out.println("\n--- Proses Bubble Sort (Descending) ---");
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);
            if (!swapped) break;
        }
    }
}