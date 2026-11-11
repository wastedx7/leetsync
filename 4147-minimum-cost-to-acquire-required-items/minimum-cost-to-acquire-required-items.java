class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long option1 = calculateCost(0, cost1, cost2, costBoth, need1, need2);
        long option2 = calculateCost(Math.min(need1, need2), cost1, cost2, costBoth, need1, need2);
        long option3 = calculateCost(Math.max(need1, need2), cost1, cost2, costBoth, need1, need2);
        
        return Math.min(option1, Math.min(option2, option3));
    }
    
    private long calculateCost(long x, long cost1, long cost2, long costBoth, long need1, long need2) {
        long rem1 = Math.max(0, need1 - x);
        long rem2 = Math.max(0, need2 - x);
        return (x * costBoth) + (rem1 * cost1) + (rem2 * cost2);
    }
}