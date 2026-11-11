public class SelectionSort {

    private void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public void selectionSortAscending(int[] arr) {
        int n = arr.length;
        System.out.println("\n--- Proses Selection Sort (Ascending) ---");
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);
        }
    }

    public void selectionSortDescending(int[] arr) {
        int n = arr.length;
        System.out.println("\n--- Proses Selection Sort (Descending) ---");
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);
        }
    }
}