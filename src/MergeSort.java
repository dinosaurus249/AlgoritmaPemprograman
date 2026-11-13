public class MergeSort {

    public static void merge(int[] arr, int left, int mid, int right, boolean ascending) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            boolean condition = ascending ? (leftArray[i] <= rightArray[j]) : (leftArray[i] >= rightArray[j]);
            if (condition) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right, boolean ascending) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            System.out.println("[DIVIDE] Memecah sub-array dari indeks " + left + " sampai " + right);

            mergeSort(arr, left, mid, ascending);
            mergeSort(arr, mid + 1, right, ascending);

            merge(arr, left, mid, right, ascending);

            System.out.print("[MERGE] Gabung indeks " + left + " - " + right + " menjadi: ");
            for (int x = left; x <= right; x++) {
                System.out.print(arr[x] + " ");
            }
            System.out.println();
        }
    }

    public void mergeSortAscending(int[] arr) {
        System.out.println("\n--- Memulai Proses Merge Sort (Ascending) ---");
        mergeSort(arr, 0, arr.length - 1, true);
    }

    public void mergeSortDescending(int[] arr) {
        System.out.println("\n--- Memulai Proses Merge Sort (Descending) ---");
        mergeSort(arr, 0, arr.length - 1, false);
    }
}