class Solution {
    public int maxProfit(int[] prices) {
        int sold=Integer.MIN_VALUE;
        int held=Integer.MIN_VALUE;
        int reset=0;

        for(int i:prices){
            int prev=sold;
            sold=i+held;
            held=Math.max(held,reset-i);
            reset=Math.max(reset,prev);
        }
        return Math.max(sold,reset);
    }
}