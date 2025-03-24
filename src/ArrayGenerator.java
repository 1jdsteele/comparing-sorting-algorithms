import java.util.Random;

public class ArrayGenerator {
    private int[] smallArray;
    private int[] mediumArray;
    private int[] largeArray;

    private int[] smallNearlySorted;
    private int[] mediumNearlySorted;
    private int[] largeNearlySorted;

    public ArrayGenerator() {
        smallArray = generateRandomArray(20);
        mediumArray = generateRandomArray(200);
        largeArray = generateRandomArray(2000);

        smallNearlySorted = generateNearlySortedArray(20);
        mediumNearlySorted = generateNearlySortedArray(200);
        largeNearlySorted = generateNearlySortedArray(2000);

    }

    //this propagates with data from -1000 to 1000
    private int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(2001) - 1000;  
        }

        return array;
    }

    //nearly sorted: each element holds it's index number, last 2 elements are swapped
    private int[] generateNearlySortedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        // Swap the last two elements to make it "nearly" sorted
        
        int temp = array[size - 1];
        array[size - 1] = array[size - 2];
        array[size - 2] = temp;
        

        return array;
    }

//getters. I chose to clone so that we don't mutate the originals if we want to compare to them. could be unneccessary, you guys let me know
    public int[] getSmallArray() {
        return smallArray.clone(); 
    }

    public int[] getMediumArray() {
        return mediumArray.clone();
    }

    public int[] getLargeArray() {
        return largeArray.clone();
    }


        public int[] getSmallNearlySorted() {
        return smallNearlySorted.clone();
    }

    public int[] getMediumNearlySorted() {
        return mediumNearlySorted.clone();
    }

    public int[] getLargeNearlySorted() {
        return largeNearlySorted.clone();
    }


}
