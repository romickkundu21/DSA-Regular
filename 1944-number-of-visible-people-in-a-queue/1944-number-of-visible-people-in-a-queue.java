class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        int res[]=new int[n];
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[i]>=heights[s.peek()]){
                res[s.pop()]++;
            }
            if(!s.isEmpty() && heights[i]<heights[s.peek()]){
                res[s.peek()]++;
            }
            s.push(i);
        }

        return res;
    }
}