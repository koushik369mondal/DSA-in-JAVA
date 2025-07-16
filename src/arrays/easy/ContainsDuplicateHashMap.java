package easy;

import java.util.*;

class ContainsDuplicateHashMap {
    public static boolean containsDuplicate(char[] nums) {
        int n = nums.length;
        HashMap<Character, Integer> map = new HashMap<>(); // Use Character, not Integer

        for (int i = 0; i < n; i++) {
            // Update frequency count
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // If count > 1, it's a duplicate
            if (map.get(nums[i]) > 1) {
                return true;
            }
        }

        return false; // No duplicates found
    }

    public static void main(String[] args) {
        char[] nums = { 'a', 'b', 'c', 'd' };
        System.out.println("Contains Duplicate: " + containsDuplicate(nums));
    }
}

