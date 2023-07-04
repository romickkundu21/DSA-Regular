class Solution {
    public int countSquares(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int dp[][]=new int[r][c];
        for(int i=0;i<r;i++)dp[i][0]=matrix[i][0];
        for(int i=0;i<c;i++)dp[0][i]=matrix[0][i];
        
        
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(matrix[i][j]==1){
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                }else{
                    dp[i][j]=0;
                }
            }
        }

        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum+=dp[i][j];
            }
        }
        return sum;
    }
}