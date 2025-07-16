package hard;
// import java.util.*;

class Solution {
    public int trap(int[] height) {
        int n = height.length;

        // Max height to the left of each bar
        int leftMax[] = new int[n]; // Create array to store max height to the left of each index
        leftMax[0] = height[0]; // First element has no left, so leftMax[0] = height[0]
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Max height to the right of each bar
        int rightMax[] = new int[n]; // Create array to store max height to the right of each index
        rightMax[n - 1] = height[n - 1]; // Last element has no right, so rightMax[n-1] = height[n-1]
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Calculate trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]); // min boundary
            trappedWater += waterLevel - height[i]; // add water if any
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }; // input
        Solution obj = new Solution(); // object
        System.out.println(obj.trap(height)); // output
    }
}
