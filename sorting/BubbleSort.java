import java.util.*;

public class BubbleSort {

    // Bubble Sort function
    public static void bubbleSort(int arr[]) {
        // Outer loop → number of passes
        for (int turn = 0; turn < arr.length - 1; turn++) {
            // Inner loop → compares adjacent elements
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) { // If left > right → swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        int arr[] = { 5, 4, 1, 3, 2 }; // Example input
        bubbleSort(arr); // Sort array
        printArray(arr); // Print sorted array
    }
}
