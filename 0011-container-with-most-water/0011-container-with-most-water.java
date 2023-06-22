class Solution {
    public int maxArea(int[] height) {
        int maxWater=0, left=0, right=height.length-1;
        while(left<right){
            maxWater=Math.max(maxWater,Math.min(height[left],height[right])*(right-left));
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
        return maxWater;
    }
}