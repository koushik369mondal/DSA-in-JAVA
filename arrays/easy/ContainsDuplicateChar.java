package easy;

import java.util.Arrays;

public class ContainsDuplicateChar {
    public static boolean containsDuplicate(char[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[] nums = { 'a', 'b', 'c', 'a' };
        System.out.println("Contains Duplicate: " + containsDuplicate(nums));
    }
}
