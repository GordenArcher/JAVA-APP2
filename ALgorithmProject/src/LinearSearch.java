public class LinearSearch {
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void runLinearSearch(int[] array, int key) {
        long startTime = System.nanoTime();
        int index = linearSearch(array, key);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("Key " + key + " found at index: " + index);
        System.out.println("Running Time: " + duration + " nanoseconds");
    }
}
