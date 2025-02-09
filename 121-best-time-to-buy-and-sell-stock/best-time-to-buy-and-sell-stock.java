class Solution {
    public int maxProfit(int[] price) {
        int BP=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<price.length;i++){
            if(BP>price[i]){
                BP=price[i];
            }
            profit=Math.max(profit,price[i]-BP);
        }
        return profit;
    }
}