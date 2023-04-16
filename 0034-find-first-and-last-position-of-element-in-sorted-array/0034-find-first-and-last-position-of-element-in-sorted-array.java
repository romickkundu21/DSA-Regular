class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int low=0,high=n-1;

        int res[]=new int[2];


        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                int i=mid,j=mid;
                while(i>=low && nums[i]==target)
                    i--;
                while(j<=high && nums[j]==target)
                    j++;
                
                res[0]=i+1;
                res[1]=j-1;
                return res;

            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        // if(n==0){
            res[0]=-1;
            res[1]=-1;
        // }
        return res;

        
    }
}