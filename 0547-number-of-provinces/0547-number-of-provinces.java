class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int visited[]=new int[n];
        int count=0;

        for(int i=0;i<n;i++){
            if(visited[i]==0){
                dfs(isConnected,visited,i,n);
                count++;
            }
        }

        return count;
    }

    public void dfs(int[][] isConnected, int[] visited, int i,int n){
        for(int j=0;j<n;j++){
            if(visited[j]==0 && isConnected[i][j]==1){
                visited[j]=1;
                dfs(isConnected,visited,j,n);
            }
        }
    }

}