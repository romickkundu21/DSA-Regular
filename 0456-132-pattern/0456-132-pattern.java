class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
        int min[]=new int[n];
        min[0]=nums[0];
        for(int i=1;i<n;i++){
            min[i]=Math.min(min[i-1],nums[i]);
        }
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(min[i]<nums[i]){
                while(!s.isEmpty() && s.peek()<=min[i]){
                    s.pop();
                }
                if(!s.isEmpty() && s.peek()<nums[i]){
                    return true;
                }
                s.push(nums[i]);
            }
        }
        return false;
    }
}