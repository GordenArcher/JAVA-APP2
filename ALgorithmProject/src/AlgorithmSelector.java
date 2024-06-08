import java.util.Scanner;

public class AlgorithmSelector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Linear Search");
        System.out.println("3. Selection Sort");
        System.out.println("4. Binary Search");
        int choice = scanner.nextInt();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        switch (choice) {
            case 1:
                BubbleSort.runBubbleSort(array);
                break;
            case 2:
                System.out.println("Enter the key to search:");
                int key1 = scanner.nextInt();
                LinearSearch.runLinearSearch(array, key1);
                break;
            case 3:
                SelectionSort.runSelectionSort(array);
                break;
            case 4:
                System.out.println("Enter the key to search:");
                int key2 = scanner.nextInt();
                BinarySearch.runBinarySearch(array, key2);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
