class Solution {
    public int minimumDeletions(int[] nums) {
        int left = 0;
        int right = 0;
        int n = nums.length;
        for(int i=1; i<n; i++){
            if(nums[i] < nums[left])
                left = i;
            if(nums[i] > nums[right])
                right = i;
        }
        int front = Math.max(left, right) + 1;
        int back = n - Math.min(left, right);
        int opp = Math.min(left, right) + 1 + n - Math.max(right, left);

        return Math.min(front, Math.min(opp, back));
    }
}