
// import java.util.*;

public class BubbleSortOptimized {

    // Optimized Bubble Sort
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swapped = false; // Flag to check if any swap happened

            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) { // If left > right → swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Swap happened
                }
            }

            // If no swap happened in this pass → array is already sorted
            if (!swapped) break;
        }
    }

    // Helper function to print array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 }; // Already sorted input
        bubbleSort(arr); // Optimized bubble sort
        printArray(arr); // Output: 1 2 3 4 5
    }
}
