class Solution {
    public int longestPalindromeSubseq(String s) {
        String t="";
        for(int i=s.length()-1;i>=0;i--){
            t+=s.charAt(i);
        }
        int m=s.length();
        int dp[][]=new int[m+1][m+1];
        return common(m,s,t,dp);
    }

    public int common(int m, String s1,String s2, int[][] dp){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][m];
    }
}