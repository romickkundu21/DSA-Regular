class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int low=0;
        int high=nums.length-1;

        while(low<high){
            int mid=(high+low)/2;
            if(mid%2==1){
                mid--;
            }if(nums[mid]!=nums[mid+1]){
                high=mid;
            }else{
                low=mid+2;
            }
        }
        return nums[low];
    }
}