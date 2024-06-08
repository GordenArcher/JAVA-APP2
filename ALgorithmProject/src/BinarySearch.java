public class BinarySearch {
    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void runBinarySearch(int[] array, int key) {
        long startTime = System.nanoTime();
        int index = binarySearch(array, key);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("Key " + key + " found at index: " + index);
        System.out.println("Running Time: " + duration + " nanoseconds");
    }
}
