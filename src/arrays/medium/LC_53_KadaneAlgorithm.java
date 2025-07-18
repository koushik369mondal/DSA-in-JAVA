package medium;
public class LC_53_KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 }; // Input array

        int currentSum = 0; // 🔁 Stores current subarray sum
        int maxSum = Integer.MIN_VALUE; // 🏆 Stores the maximum subarray sum found so far

        // 🔄 Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i]; // ➕ Add current element to currentSum

            if (currentSum > maxSum) {
                maxSum = currentSum; // 🎯 Update maxSum if currentSum is greater
            }

            if (currentSum < 0) {
                currentSum = 0; // 🔄 Reset currentSum if it goes negative
            }
        }

        // 📢 Final result
        System.out.println("Maximum Subarray Sum (Kadane's Algorithm): " + maxSum);
    }
}
