public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0; // reset if sum goes negative
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
