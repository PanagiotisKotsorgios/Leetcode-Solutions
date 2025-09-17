from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # Dictionary to store numbers we've seen and their indices
        num_to_index = {}
        
        for i, num in enumerate(nums):
            complement = target - num  # The number we need to reach the target
            
            if complement in num_to_index:
                # Found the two numbers
                return [num_to_index[complement], i]
            
            # Store the current number and its index
            num_to_index[num] = i
        
        return []

