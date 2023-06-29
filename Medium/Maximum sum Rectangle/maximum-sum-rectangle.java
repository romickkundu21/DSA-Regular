//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maximumSumRectangle(N, M, a));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int maximumSumRectangle(int R, int C, int M[][]) {
        // code here
        int maxSum=Integer.MIN_VALUE;
        int sum[]=new int[R];
        for(int i=0;i<C;i++){
            Arrays.fill(sum,0);
            for(int j=i;j<C;j++){
                for(int k=0;k<R;k++){
                    sum[k]+=M[k][j];
                }
                maxSum=Math.max(maxSum,kadane(sum));
            }
        }
        return maxSum;
    }
    
    public int kadane(int sum[]){
        int mmax=Integer.MIN_VALUE;
        int mmin=0;
        for(int i=0;i<sum.length;i++){
            mmin+=sum[i];
            if(mmin>mmax){
                mmax=mmin;
            }
            if(mmin<0){
                mmin=0;
            }
        }
        return mmax;
    }
};