package easy;
import java.util.Scanner;

public class LinearSearch {

    // Function to perform linear search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

        int result = linearSearch(numbers, key); // compare number with key

        if (result == -1) {
            System.out.println("Number not found.");
        } else {
            System.out.println("Number found at index: " + result);
        }

        sc.close(); // Close scanner to avoid warning
    }
}
