class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> res=new Stack<Integer>();

        for(int i=nums.length-1;i>=0;i--){
            res.push(nums[i]);
        }

        for(int i=nums.length-1;i>=0;i--){
            int number=nums[i];
            while(!res.isEmpty() && res.peek()<=nums[i]){
                res.pop();
            }
            if(res.empty()){
                nums[i]=-1;
            }else{
                nums[i]=res.peek();
            }
            res.push(number);
        }

        return nums;
    }
}