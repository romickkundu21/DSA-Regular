class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String t:tokens){
            if("+-*/".contains(t)){
                s.push(eval(t,s.pop(),s.pop()));
            }else{
                s.push(Integer.parseInt(t));
            }
        }
        return s.pop();
    }

    public static int eval(String op,int b,int a){
        if("+".equals(op)){
            return a+b;
        }
        else if("-".equals(op)){
            return a-b;
        }
        else if("*".equals(op)){
            return a*b;
        }else{
            return a / b;
        }
    }
}