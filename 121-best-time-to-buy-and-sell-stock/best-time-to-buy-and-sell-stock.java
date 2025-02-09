class Solution {
    public int maxProfit(int[] price) {
        int BP=price[0];
        int profit=0;
        for(int i=1;i<price.length;i++){
            if(BP>price[i]){
                BP=price[i];
            }
            profit=Math.max(profit,price[i]-BP);
        }
        return profit;
    }
}