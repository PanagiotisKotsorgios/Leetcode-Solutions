class Solution {

    /**
     * @param Integer[] $nums
     * @param Integer $target
     * @return Integer[]
     */
    function twoSum($nums, $target) {
        $numToIndex = []; // associative array to store number => index
        
        foreach ($nums as $i => $num) {
            $complement = $target - $num;
            
            if (isset($numToIndex[$complement])) {
                // Found the two numbers
                return [$numToIndex[$complement], $i];
            }
            
            $numToIndex[$num] = $i;
        }
        
        return [];
    }
}
