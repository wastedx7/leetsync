class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int streak = 1;
        int up = 1;
        int down = 1;
        for(int i=1; i<nums.length; i++){
            up = nums[i-1] < nums[i] ? up + 1 : 1;
            down = nums[i-1] > nums[i] ? down + 1 : 1;
            streak = Math.max(streak, Math.max(up, down));
        }
        return streak;
    }
}