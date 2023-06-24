class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int k=1;
        int rowBegin=0; 
        int rowEnd=n-1; 
        int columnBegin=0;
        int columnEnd=n-1; 

        while(rowBegin<=rowEnd && columnBegin<=columnEnd){
            for(int i=columnBegin;i<=columnEnd;i++){
                res[rowBegin][i]=k++;
            }
            rowBegin++;

            for(int i=rowBegin;i<=rowEnd;i++){
                res[i][columnEnd]=k++;
            }
            columnEnd--;
            if(rowBegin<=rowEnd){
                for(int i=columnEnd;i>=columnBegin;i--){
                    res[rowEnd][i]=k++;
                }
            }
            rowEnd--;
            if(columnBegin<=columnEnd){
                for(int i=rowEnd;i>=rowBegin;i--){
                    res[i][columnBegin]=k++;
                }
            }
            columnBegin++;
        }
        return res;
    }
}