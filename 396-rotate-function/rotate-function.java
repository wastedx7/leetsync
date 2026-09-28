class Solution {
    public int maxRotateFunction(int[] nums) {
        long sum = 0;
        long gugu = 0;
        long n = nums.length;
        for(int i=0; i<n; i++){
            sum += nums[i];
            gugu += (long) i * nums[i];
        }
        long gaga = gugu;
        for(int i=1; i<n; i++){
            gugu += sum - n * nums[(int) n-i];
            gaga = Math.max(gugu, gaga);
        }
        return (int) gaga;
    }
}