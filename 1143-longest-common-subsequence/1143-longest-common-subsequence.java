class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m+1][n+1];
        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=n;j++){
        //         dp[i][j]=-1;
        //     }
        // }
        // return common(m,n,text1,text2,dp);
        return common(m,n,text1,text2,dp);
    }
    public int common(int m,int n, String s1,String s2, int[][] dp){
        // if(m==0 || n==0)return 0;
        // if(dp[m][n]!=-1){
        //     return dp[m][n];
        // }
        // if(s1.charAt(m-1)==s2.charAt(n-1)){
        //     return dp[m][n]=1+common(m-1,n-1,s1,s2,dp);
        // }
        // return dp[m][n]=Math.max(common(m-1,n,s1,s2,dp),common(m,n-1,s1,s2,dp));

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}