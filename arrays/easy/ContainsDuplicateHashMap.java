package easy;

import java.util.*;

class ContainsDuplicateHashMap {
    public static boolean containsDuplicate(char[] nums) {
        int n = nums.length;
        HashMap<Character, Integer> map = new HashMap<>();
        // We are creating a notebook (called map)
        // This notebook will store characters as keys (Character)
        // And how many times each character appeared as values (Integer)

        for (int i = 0; i < n; i++) {
            // Update frequency count
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            // Get current count of nums[i], or 0 if it's not seen before
            // Add 1 to update the count (seen again now)
            // Store the updated count back in the map

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
