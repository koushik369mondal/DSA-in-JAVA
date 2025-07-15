import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println("Number found at index: " + i);
                return; // Exit as soon as number is found
            }
        }

        System.out.println("Number not found.");
    }
}
