class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res=0, pSum=0;
        int count[]=new int[nums.length+1];
        count[0]=1;
        for(int i:nums){
            pSum+=i;
            if(pSum>=goal){
                res+=count[pSum-goal];
            }
            count[pSum]++;
        }
        return res;
    }
}