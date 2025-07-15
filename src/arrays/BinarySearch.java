import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = { 5, 10, 15, 20, 25, 30 }; // sorted array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                System.out.println("Number found at index: " + mid);
                return; // Exit once found
            }

            if (numbers[mid] < key) {
                start = mid + 1; // go right
            } else {
                end = mid - 1; // go left
            }
        }

        System.out.println("Number not found.");
    }
}
