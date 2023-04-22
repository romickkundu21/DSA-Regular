class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];

        left[0]=0;
        right[n-1]=0;

        for(int i=1;i<n;i++){
            int temp=left[i-1]+nums[i-1];
            left[i]+=temp;
        }

        for(int i=n-2;i>=0;i--){
            int temp=right[i+1]+nums[i+1];
            right[i]+=temp;
        }

        for(int i=0;i<n;i++){
            nums[i]=Math.abs(left[i]-right[i]);
        }

        return nums;
    }
}