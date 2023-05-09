class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int size=cardPoints.length-k;
        int sum=0;
        for(int i=size;i<=cardPoints.length-1;i++){
            sum+=cardPoints[i];
        }
        int ans=sum;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
            sum-=cardPoints[i+size];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}