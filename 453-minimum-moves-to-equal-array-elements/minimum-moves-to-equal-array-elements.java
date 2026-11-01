class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for(int i=1; i<nums.length; i++){
            min = Math.min(min, nums[i]);
        }
        int moves = 0;
        for(int n : nums){
            moves += n - min;
        }
        return moves;
    }
}