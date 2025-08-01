package medium;

public class LC_152_MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        // Initialize max and min product so far with first element
        int maxProd = nums[0];
        int minProd = nums[0];
        int ans = nums[0];

        // Traverse from index 1
        for (int i = 1; i < nums.length; i++) {
            // If current number is negative, swap max and min
            // Because multiplying by a negative flips signs
            if (nums[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            // Calculate max and min product ending at current index
            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);

            // Update overall answer
            ans = Math.max(ans, maxProd);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, -2, 4 };
        System.out.println("Max Product Subarray: " + maxProduct(nums)); // Output: 6
    }
}
