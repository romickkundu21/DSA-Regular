class Solution {
    public boolean isValid(String s) {
        Stack<Character> res=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                res.push(')');
            }
            else if(s.charAt(i)=='['){
                res.push(']');
            }
            else if(s.charAt(i)=='{'){
                res.push('}');
            }
            else{
                if(res.empty() || s.charAt(i)!=res.peek()){
                    return false;
                }
                res.pop();
            }
        }
        return res.empty();
    }
}