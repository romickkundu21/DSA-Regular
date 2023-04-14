class Solution {
    public boolean check(int[] nums) {
        int x=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                x++;
            }
            if(x>1){
                return false;
            }
        }
        return true;
    }
}