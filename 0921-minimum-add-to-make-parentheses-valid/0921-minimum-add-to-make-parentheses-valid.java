class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int res=0;
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else if(st.size()>0 && st.peek()=='('){
                st.pop();
            }else{
                res++;
            }
        }
        return res+st.size();
    }
}