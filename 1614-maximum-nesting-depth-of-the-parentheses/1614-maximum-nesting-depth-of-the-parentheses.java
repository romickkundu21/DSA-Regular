class Solution {
    public int maxDepth(String s) {
        int depth=0, brack=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                brack++;
            }else if(s.charAt(i)==')'){
                brack--;
            }
            depth=Math.max(depth,brack);
        }
        return depth;
    }
}