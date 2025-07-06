// import java.util.*; // Not required in this program

public class TrappedRainWater {
    public static int TrappedWater(int height[]) {
        int n = height.length;

        // Step 1: Calculate left max boundary for every bar
        int leftMax[] = new int[n]; // stores tallest bar to the left (including current)
        leftMax[0] = height[0]; // first element is same
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]); // compare current with previous max
        }

        // Step 2: Calculate right max boundary for every bar
        int rightMax[] = new int[n]; // stores tallest bar to the right (including current)
        rightMax[n - 1] = height[n - 1]; // last element is same
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]); // compare current with next max
        }

        // Step 3: Calculate trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]); // lowest of both sides
            trappedWater += waterLevel - height[i]; // water above current bar
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(TrappedWater(height)); // Output: 11
    }
}
