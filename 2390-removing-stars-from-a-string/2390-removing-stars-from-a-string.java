class Solution {
    public String removeStars(String s) {
        // String st="";
        // Stack<Character> stack=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='*' && !stack.isEmpty()){
        //         stack.pop();
        //     }else{
        //         stack.push(s.charAt(i));
        //     }
        // }
        // for(int i=0;i<stack.size();i++){
        //     st+=stack.pop();
        // }
        // return st;

        String st="";
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='*')count++;
            else if(count==0){
                st=s.charAt(i)+st;
            }else{
                count--;
            }
        }
        return st;
    }
}