import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }

    public static void runSelectionSort(int[] array) {
        long startTime = System.nanoTime();
        selectionSort(array);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Running Time: " + duration + " nanoseconds");
    }
}
