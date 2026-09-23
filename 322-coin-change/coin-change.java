class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, amount+1);
        minCoins[0] = 0;

        for(int amt=1; amt<minCoins.length; amt++){
            for(int c=0; c<coins.length; c++){
                if(amt-coins[c] >= 0){
                    minCoins[amt] = Math.min(minCoins[amt], 1 + minCoins[amt - coins[c]]);
                }
            }
        }
        return minCoins[amount] != amount + 1 ? minCoins[amount] : -1;
    }
}