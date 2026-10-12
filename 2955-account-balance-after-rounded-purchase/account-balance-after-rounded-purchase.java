class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        purchaseAmount = ((purchaseAmount + 5) / 10) * 10;
        int balance = 100 - purchaseAmount;
        return balance;
    }
}