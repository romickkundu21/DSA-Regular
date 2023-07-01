class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set=new HashSet<>();
        for(String i:wordDict){
            set.add(i);
        }
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        Arrays.fill(dp,false);
        dp[0]=true;

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}