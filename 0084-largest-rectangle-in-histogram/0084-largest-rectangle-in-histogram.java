class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int ps[]=prevSmaller(heights);
        int ns[]=nextSmaller(heights);
        int maxArea=0;
        for(int i=0;i<n;i++){
            int area=(ns[i]-ps[i]-1)*heights[i];
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }

    public int[] prevSmaller(int[] a){
        int ps[]=new int[a.length];
        Stack<Integer> s=new Stack();
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() && a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=-1;
            }else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        return ps;
    }
    public int[] nextSmaller(int[] a){
        int ps[]=new int[a.length];
        Stack<Integer> s=new Stack();
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=a.length;
            }else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        return ps;
    }
}