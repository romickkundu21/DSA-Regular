class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int dp[][]=new int[m][m];
        for(int i=0;i<m;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<m;j++){
                if(j==0){
                   dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j+1]); 
                }else if(j==m-1){
                    dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j-1]);
                }else{
                    dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j-1]);
                    dp[i][j]=Math.min(dp[i-1][j+1],dp[i][j]);
                }
                dp[i][j]+=matrix[i][j];
            }
        }
        int res=Integer.MAX_VALUE;
        for(int i:dp[m-1]){
            res=Math.min(res,i);
        }
        return res;
    }
}