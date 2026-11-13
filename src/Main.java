import java.util.Scanner;

public class Main {
    private static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 100 data sesuai ketentuan modul
        int[] influencerFollowers = {
                1200, 4500, 300, 8900, 15000, 2300, 7800, 9200, 4100, 600,
                5300, 1100, 9900, 3400, 8700, 12000, 450, 6700, 2100, 14000,
                3300, 7600, 5400, 890, 10500, 6200, 4300, 1500, 9800, 7100,
                2500, 13000, 4800, 9100, 3100, 6400, 8200, 11500, 2900, 7400,
                5000, 12500, 3800, 9600, 1900, 6800, 4200, 10200, 2700, 8300,
                6100, 14500, 3500, 7900, 2200, 9400, 4700, 11800, 3200, 7500,
                5600, 13500, 4000, 9000, 2400, 6600, 4900, 10800, 2800, 8400,
                6300, 15000, 3700, 8100, 2000, 9500, 4600, 11200, 3000, 7300,
                5200, 12200, 3900, 8800, 2600, 6900, 4400, 10400, 2150, 8600,
                5900, 14200, 3600, 8000, 2350, 9300, 4850, 11600, 3350, 7700
        };

        System.out.println("==================================================");
        System.out.println("   Z-APP : TOP 100 INFLUENCER RANKING ENGINE      ");
        System.out.println("==================================================");
        System.out.println("Total Data Influencer: " + influencerFollowers.length + " data");
        System.out.print("Tampilkan 15 data awal (Original): ");
        int[] samplePreview = new int[15];
        System.arraycopy(influencerFollowers, 0, samplePreview, 0, 15);
        printArray(samplePreview);
        System.out.println("...");
        System.out.println("--------------------------------------------------");

        System.out.println("Pilih Algoritma Sorting:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Shell Sort");
        System.out.println("5. Merge Sort");
        System.out.println("6. Quick Sort");
        System.out.print("Masukkan pilihan (1-6): ");
        int algoChoice = scanner.nextInt();

        System.out.println("\nPilih Urutan Pengurutan:");
        System.out.println("1. Ascending (Menaik)");
        System.out.println("2. Descending (Menurun)");
        System.out.print("Masukkan pilihan (1/2): ");
        int orderChoice = scanner.nextInt();

        int[] dataToSort = influencerFollowers.clone();

        if (algoChoice == 1) {
            BubbleSort bubble = new BubbleSort();
            if (orderChoice == 1) {
                bubble.bubbleSortAscending(dataToSort);
            } else if (orderChoice == 2) {
                bubble.bubbleSortDescending(dataToSort);
            } else {
                System.out.println("Pilihan urutan tidak valid.");
                scanner.close();
                return;
            }
        } else if (algoChoice == 2) {
            SelectionSort selection = new SelectionSort();
            if (orderChoice == 1) {
                selection.selectionSortAscending(dataToSort);
            } else if (orderChoice == 2) {
                selection.selectionSortDescending(dataToSort);
            } else {
                System.out.println("Pilihan urutan tidak valid.");
                scanner.close();
                return;
            }
        } else if (algoChoice == 3) {
            InsertionSort insertion = new InsertionSort();
            if (orderChoice == 1) {
                insertion.insertionSortAscending(dataToSort);
            } else if (orderChoice == 2) {
                insertion.insertionSortDescending(dataToSort);
            } else {
                System.out.println("Pilihan urutan tidak valid.");
                scanner.close();
                return;
            }
        } else if (algoChoice == 4) {
            ShellSort shell = new ShellSort();
            if (orderChoice == 1) {
                shell.shellSortAscending(dataToSort);
            } else if (orderChoice == 2) {
                shell.shellSortDescending(dataToSort);
            } else {
                System.out.println("Pilihan urutan tidak valid.");
                scanner.close();
                return;
            }
        } else if (algoChoice == 5) {
            MergeSort merge = new MergeSort();
            if (orderChoice == 1) {
                merge.mergeSortAscending(dataToSort);
            } else if (orderChoice == 2) {
                merge.mergeSortDescending(dataToSort);
            } else {
                System.out.println("Pilihan urutan tidak valid.");
                scanner.close();
                return;
            }
        } else if (algoChoice == 6) {
            QuickSort quick = new QuickSort();
            if (orderChoice == 1) {
                quick.quickSortAscending(dataToSort);
            } else if (orderChoice == 2) {
                quick.quickSortDescending(dataToSort);
            } else {
                System.out.println("Pilihan urutan tidak valid.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Pilihan algoritma tidak valid.");
            scanner.close();
            return;
        }

        System.out.println("--------------------------------------------------");
        System.out.print("Hasil Akhir Setelah Sorting (Semua Data): ");
        printArray(dataToSort);
        System.out.println("==================================================");

        scanner.close();
    }
}