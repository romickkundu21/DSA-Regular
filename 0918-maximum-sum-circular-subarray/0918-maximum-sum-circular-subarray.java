class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int curr1=nums[0];
        int min=nums[0];
        int curr2=nums[0];
        int max=nums[0];

        for(int i=1;i<nums.length;i++){
            curr1=Math.min(curr1+nums[i],nums[i]);
            min=Math.min(min,curr1);
            curr2=Math.max(curr2+nums[i],nums[i]);
            max=Math.max(max,curr2);
        }

        if(sum==min){
            return max;
        }
        return Math.max(max,sum-min);
    }
}