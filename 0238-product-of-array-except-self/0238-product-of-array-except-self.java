class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int left=1,right=1;
        int[] res=new int[n];

        for(int i=0;i<n;i++){
            res[i]=1;
        }
        for(int i=0;i<n;i++){
            res[i]*=left;
            left*=nums[i];
            System.out.println(res[i]);
        }
        for(int i=n-1;i>=0;i--){
            res[i]*=right;
            right*=nums[i];
            System.out.println(res[i]);
        }
        return res;
    }
}