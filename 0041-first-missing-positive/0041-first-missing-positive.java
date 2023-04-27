class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            while(x>=1 && x<=nums.length && nums[x-1]!=x){
                int temp=nums[x-1];
                nums[x-1]=x;
                x=temp;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
}