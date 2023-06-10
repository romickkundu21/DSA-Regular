class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxSum=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            maxSum=Math.max(maxSum,sum);
        }
        return (maxSum/1.0)/k;
    }
}