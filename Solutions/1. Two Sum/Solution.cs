using System.Collections.Generic;

public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        // Dictionary to store number and its index
        Dictionary<int, int> numToIndex = new Dictionary<int, int>();
        
        for (int i = 0; i < nums.Length; i++) {
            int complement = target - nums[i];
            
            if (numToIndex.ContainsKey(complement)) {
                // Found the two numbers
                return new int[] { numToIndex[complement], i };
            }
            
            // Store the current number and its index
            numToIndex[nums[i]] = i;
        }
        

        return new int[0];
    }
}
