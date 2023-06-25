class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff=Integer.MAX_VALUE;
        int res=0;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int first=nums[i];
            int start=i+1;
            int end=n-1;
            while(start<end){
                if(first+nums[start]+nums[end]==target){
                    return target;
                }else if(Math.abs((first+nums[start]+nums[end])-target)<diff){
                    diff=Math.abs((first+nums[start]+nums[end])-target);
                    res=first+nums[start]+nums[end];
                }
                if(first+nums[start]+nums[end]>target){
                    end--;
                }else{
                    start++;
                }
            }
        }
        return res;
    }
}