class Solution {
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return perfect(n,dp);
    }

    int perfect(int n,int dp[]){
        if(dp[n]!=-1)return dp[n];
        if(n==0)return 0;
        int min=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int curr=perfect(n-i*i,dp)+1;
            min=Math.min(min,curr);
        }
        return dp[n]=min;
    }
}