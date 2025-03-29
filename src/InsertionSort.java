public class InsertionSort {








    public static void sort(int[] numbers, int numbersSize) {

        //logic to sort
        // for loop moving up indices
        for (int i = 1; i < numbersSize; ++i){
            // nested while looop sorting every element with its previous
            int j = i;
            while (j > 0 && numbers[j] < numbers[j-1]){
                int temp = numbers[j];
                numbers[j] =  numbers[j - 1];
                numbers[j - 1] = temp;
                --j;
            }
        }
            
        
    }
}