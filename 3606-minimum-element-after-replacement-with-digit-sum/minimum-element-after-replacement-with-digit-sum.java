class Solution {
    public int minElement(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = digitSum(nums[i]);
        }
        int min = nums[0];
        for(int i=0; i<nums.length; i++){
            min = Math.min(nums[i], min);
        }
        return min;
    }
    private int digitSum(int n){
        int sum = 0;;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}