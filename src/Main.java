
//compiling note (Jake's machine)
// to compile: javac src/*.java
// to run: java -cp src Main


//NOTE - array sizes
//small - 20
//medium - 200
//large - 2k


public class Main {


    public static void main(String[] args) {
        System.out.println("Hello cruel world!");


        ArrayGenerator arrays = new ArrayGenerator();

        int[] smallArray = arrays.getSmallArray();
        int[] mediumArray = arrays.getMediumArray();
        int[] largeArray = arrays.getLargeArray();

        printArray(smallArray, 20);

        int[] smallArrayNS = arrays.getSmallNearlySorted();

        printArray(smallArrayNS, 20);


//        Jonathan's test to upload
         System.out.println("Jonathan's test");
         long quickSortstartTime = System.nanoTime();

         int[] jonathanArray = arrays.getSmallArray();
         quickSortstartTime = System.nanoTime();
         QuickSort.runSort(jonathanArray,0, 19);
         long quickSortendTime = System.nanoTime();
         long quickSortDuration = quickSortendTime - quickSortstartTime ;
         System.out.println("Quicksort Small Array Execution time: " + quickSortDuration / 1_000_000.0 + " ms");

        jonathanArray = arrays.getMediumArray();
        quickSortstartTime = System.nanoTime();
        QuickSort.runSort(jonathanArray,0, 19);
        quickSortendTime = System.nanoTime();
        quickSortDuration = quickSortendTime - quickSortstartTime ;
        System.out.println("Quicksort Medium Array Execution time: " + quickSortDuration / 1_000_000.0 + " ms");

        jonathanArray = arrays.getLargeArray();
        quickSortstartTime = System.nanoTime();
        QuickSort.runSort(jonathanArray,0, 19);
        quickSortendTime = System.nanoTime();
        quickSortDuration = quickSortendTime - quickSortstartTime ;
        System.out.println("Quicksort Large Array Execution time: " + quickSortDuration / 1_000_000.0 + " ms");

        jonathanArray = arrays.getSmallNearlySorted();
        quickSortstartTime = System.nanoTime();
        QuickSort.runSort(jonathanArray,0, 19);
        quickSortendTime = System.nanoTime();
        quickSortDuration = quickSortendTime - quickSortstartTime ;
        System.out.println("Quicksort Small Near Sorted Array Execution time: " + quickSortDuration / 1_000_000.0 + " ms");

        jonathanArray = arrays.getMediumNearlySorted();
        quickSortstartTime = System.nanoTime();
        QuickSort.runSort(jonathanArray,0, 19);
        quickSortendTime = System.nanoTime();
        quickSortDuration = quickSortendTime - quickSortstartTime ;
        System.out.println("Quicksort Medium Near Sorted Array Execution time: " + quickSortDuration / 1_000_000.0 + " ms");

        jonathanArray = arrays.getLargeNearlySorted();
        quickSortstartTime = System.nanoTime();
        QuickSort.runSort(jonathanArray,0, 19);
        quickSortendTime = System.nanoTime();
        quickSortDuration = quickSortendTime - quickSortstartTime ;
        System.out.println("Quicksort Large Array Execution time: " + quickSortDuration / 1_000_000.0 + " ms");


        //MJ's test to upload
        // System.out.println("MJ's test");
        // int[] mjArray = arrays.getSmallArray();
        // printArray(mjArray, 20);




    }

    private static void printArray(int[] array, int size){
        for (int i = 0; i < size; i++){
            System.out.println(array[i]);
        }
    }


}