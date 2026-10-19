class Solution {
    public boolean checkDivisibility(int n) {
        return n % digit(n) == 0;
    }
    private int digit(int n){
        int sum = 0;
        int prod = 1;
        while(n != 0){
            sum += n % 10;
            prod *= n % 10;
            n /= 10;
        }
        return sum + prod;
    }
}