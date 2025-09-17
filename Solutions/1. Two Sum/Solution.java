/*
Idea for solution:

Use a HashMap to keep track of numbers we have seen and their indices.
For each number nums[i], check if target - nums[i] already exists in the map:
If yes, return [index of that number, i].
If no, put nums[i] in the map with its index.
This works efficiently because checking a HashMap is O(1).
*/

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // The number we need to reach target
            
            if (map.containsKey(complement)) {
                // we found the two numbers
                return new int[] { map.get(complement), i };
            }
            
            
            map.put(nums[i], i);
        }
        
       
        return new int[] {};
    }
}
