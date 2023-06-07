//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        int m=grid.length, n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    dfs(i,j,grid,2);
                }
            }
        }
        int minutes=2;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    return -1;
                }else if(grid[i][j]>=2){
                    minutes=Math.max(minutes,grid[i][j]);
                }
            }
        }
        return minutes-2;
    }
    
    public void dfs(int i, int j, int[][] grid,int m){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0 || (grid[i][j]>1 && grid[i][j]<m)){
            return;
        }
        grid[i][j]=m;
        dfs(i+1,j,grid,m+1);
        dfs(i-1,j,grid,m+1);
        dfs(i,j+1,grid,m+1);
        dfs(i,j-1,grid,m+1);
    }
}