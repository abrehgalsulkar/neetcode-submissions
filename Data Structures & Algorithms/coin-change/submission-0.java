class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        Arrays.sort(coins);
        if(coins.length == 1) {
            if (coins[0] == amount) {
                return 1;
            }
        }

        //int size = amount + 1;
        int[] amounts = new int[amount +1];
        Arrays.fill(amounts, amount +1);
        amounts[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if ((coin <= i) && amounts[i-coin] <= amount) {
                    int curr = amounts[i];
                    int other = amounts[i-coin]+1;
                    if(other < curr) {
                        amounts[i] = other;
                    }
                }
            }
        }
        
       if(amounts[amount] != amount+1) {
        return amounts[amount];
       }
        return -1;
    }
}