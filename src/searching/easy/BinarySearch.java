package easy;
import java.util.Scanner;

public class BinarySearch {

    // Function to perform binary search
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid; // Found at index mid
            }

            if (arr[mid] < key) {
                start = mid + 1; // Go right
            } else {
                end = mid - 1; // Go left
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 10, 15, 20, 25, 30 }; // sorted array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();
        sc.close(); // 🔒 Close Scanner

        int result = binarySearch(numbers, key);

        if (result == -1) {
            System.out.println("Number not found.");
        } else {
            System.out.println("Number found at index: " + result);
        }
    }
}
