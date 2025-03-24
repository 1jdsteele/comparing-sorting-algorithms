
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




    }

    private static void printArray(int[] array, int size){
        for (int i = 0; i < size; i++){
            System.out.println(array[i]);
        }
    }


}