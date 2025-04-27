

public class BubbleSortAnalysis {

    // Bubble Sort implementation
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr3 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
                      21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
                      41,42,43,44,45,46,47,48,49,50};
        int[] arr4 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr4[i] = i + 1;
        }

        measureAndPrint(arr1);
        measureAndPrint(arr2);
        measureAndPrint(arr3);
        measureAndPrint(arr4);
    }

    // Measure execution time
    public static void measureAndPrint(int[] array) {
        int[] tempArray = array.clone(); // Clone to avoid sorting the original array

        long startTime = System.nanoTime();
        bubbleSort(tempArray);
        long endTime = System.nanoTime();

        long duration = endTime - startTime; // nanoseconds
        System.out.println("Array size: " + array.length + ", Execution time: " + duration + " nanoseconds");
    }
}
