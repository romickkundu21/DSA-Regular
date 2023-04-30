class MinStack {
    Stack<Integer> res=new Stack<Integer>();
    int minVal=Integer.MAX_VALUE;

    public MinStack() {
    }
    
    public void push(int val) {
        if(val<=minVal){
            res.push(minVal);
            minVal=val;
        }
        res.push(val);
    }
    
    public void pop() {
        if(res.pop()==minVal){
            minVal=res.pop();
        }
    }
    
    public int top() {
        return res.peek();
    }
    
    public int getMin() {
        return minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */