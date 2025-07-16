// 217. Contains Duplicate

package easy;

import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // sort the array first

        for (int i = 0; i < nums.length - 1; i++) {
            // check adjacent elements
            if (nums[i] == nums[i + 1]) {
                return true; // duplicate found
            }
        }

        return false; // no duplicate found
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 2 };
        System.out.println("Contains Duplicate: " + containsDuplicate(nums));
    }
}
