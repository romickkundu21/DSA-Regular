class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }

        int arr[]=new int[n];

        if(ind==-1){
            int j=n;
            for(int i=0;i<n;i++){
                arr[j-1]=nums[i];
                j--;
            }
            for(int i=0;i<n;i++){
                nums[i]=arr[i];
            }
            return;
        }

        for(int i=n-1;i>=ind;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }

        int k=nums.length;
        int arr1[]=new int[n];
        
        for(int i=ind+1;i<n;i++){
            arr1[k-1]=nums[i];
            k--;
        }
        for(int i=ind+1;i<n;i++){
            nums[i]=arr1[i];
        }
    }
}