class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(digitSum(nums[i]) == i){
                return i;
            }
        }
        return -1;
    }
    private int digitSum(int num){
        int x = 0;
        while(num != 0){
            x += num % 10;
            num /= 10;
        }
        return x;
    }
}