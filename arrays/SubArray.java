public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};  // Sample array

        // Outer loop to set start index
        for (int i = 0; i < arr.length; i++) {
            // Inner loop to set end index
            for (int j = i; j < arr.length; j++) {
                // Print subarray from i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println(); // New line after each subarray
            }
        }
    }
}
