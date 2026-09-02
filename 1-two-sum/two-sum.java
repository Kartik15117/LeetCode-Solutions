class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store: Value -> Index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If complement exists, we found the pair
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, store the current number and index
            map.put(nums[i], i);
        }
        
        // Return empty array if no solution is found
        return new int[] {};
    }
}
        
