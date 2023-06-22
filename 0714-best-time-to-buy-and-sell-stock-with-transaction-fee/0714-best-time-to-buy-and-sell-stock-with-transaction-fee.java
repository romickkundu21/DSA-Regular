class Solution {
    public int maxProfit(int[] prices, int fee) {
        int curr=prices[0];
        int res=0;
        for(int i=1;i<prices.length;i++){
            curr=Math.min(curr,prices[i]-res);
            res=Math.max(res,prices[i]-curr-fee);
        }
        return res;
    }
}