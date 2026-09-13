class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        if(x == 1 || n == 0){
            return 1;
        } else if(x == -1){
            return (n % 2 == 0) ? 1 : -1;
        } else if(n > 0){
            for(int i=0; i<n; i++){
                ans *= x;
                if(ans == 0 || Double.isInfinite(ans)){
                    break;
                }
            }
        } else if(n < 0){
            long power = Math.abs((long) n);
            for(long i=0; i<power; i++){
                ans /= x;
                if(ans == 0 || Double.isInfinite(ans)){
                    break;
                }
            }
        }
        return ans;
    }
}