class Solution {
    public int combinationSum4(int[] nums, int target) {
        // Use an Integer array so uncalculated states remain null
        Integer[] memo = new Integer[target + 1];
        return helper(nums, target, memo);
    }
    
    private int helper(int[] nums, int target, Integer[] memo) {
        if (target == 0) return 1;
        
        // If we already calculated this target, return the cached result
        if (memo[target] != null) return memo[target];
        
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i]) {
                res += helper(nums, target - nums[i], memo);
            }
        }
        
        // Save the result to the cache before returning
        memo[target] = res;
        return res;
    }
}