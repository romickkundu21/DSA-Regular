class Solution {
    public long subArrayRanges(int[] nums) {
        long res=0;
        for(int i=0;i<nums.length;i++){
            int low=nums[i],high=nums[i];
            for(int j=i;j<nums.length;j++){
                low=Math.min(low,nums[j]);
                high=Math.max(high,nums[j]);
                res+=high-low;
            }
        }
        return res;
    }
}