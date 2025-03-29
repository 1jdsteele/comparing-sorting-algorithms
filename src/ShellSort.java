public class ShellSort {

    // Sorts the array using the Shell Sort algorithm.
    public static void sort(int[] numbers, int numbersSize) {
        // Start with a large gap, then reduce the gap
        for (int gap = numbersSize / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size.
            for (int i = gap; i < numbersSize; i++) {
                int temp = numbers[i];
                int j = i;
                // Shift earlier gap-sorted elements up until the correct location is found
                while (j >= gap && numbers[j - gap] > temp) {
                    numbers[j] = numbers[j - gap];
                    j -= gap;
                }
                // Put temp (the original numbers[i]) in its correct location
                numbers[j] = temp;
            }
        }
    }
}
