public class QuickSort {


    public QuickSort() {

    }

    //Recursive function
    public static void runSort(int[] arr, int low, int high) {

        //base case. Returns when the array is a single element or smaller.
        if(low >= high){
            return;
        }

        int lowIndex = partition(arr, low, high);

        runSort(arr, low, lowIndex);
        runSort(arr, lowIndex+1, high);

    }

    public static int partition(int[] arr, int low, int high){
        //Setting pivot point to middle element
        int midpoint = low + ( high - low ) / 2;
        int pivot = arr[midpoint];

        boolean done = false;

        while(!done){
            // Increment lower index while the numbers in the lower half of the array are less than the pivot number.
            while(arr[low] < pivot){
                low += 1;
            }
            // Decrement higher index while the numbers in the upper half of the array are less than the pivot number.
            while(pivot < arr[high]){
                high -= 1;
            }
            //if the value of low becomes greater than or equal to high, we've traversed the entire array.
            if(low >= high){
                done = true;
            } else {
            //otherwise, we swap the low and high numbers and increment/decrement low/high, moving on to the next set of numbers.
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low += 1;
            high -= 1;
            }
        }
        return high;
    };
    

}
