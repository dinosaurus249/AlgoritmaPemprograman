public class ShellSort {

    private void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public void shellSortAscending(int[] arr) {
        int n = arr.length;
        System.out.println("\n--- Proses Shell Sort (Ascending) ---");
        int pass = 1;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
            System.out.print("Pass " + pass++ + " (Gap " + gap + "): ");
            printArray(arr);
        }
    }

    public void shellSortDescending(int[] arr) {
        int n = arr.length;
        System.out.println("\n--- Proses Shell Sort (Descending) ---");
        int pass = 1;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] < temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
            System.out.print("Pass " + pass++ + " (Gap " + gap + "): ");
            printArray(arr);
        }
    }
}