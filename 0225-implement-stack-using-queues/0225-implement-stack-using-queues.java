class MyStack {
    Queue<Integer> res=new LinkedList<Integer>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        res.add(x);
        for(int i=1;i<res.size();i++){
            res.add(res.remove());
        }
    }
    
    public int pop() {
        return res.remove();
    }
    
    public int top() {
        return res.peek();
    }
    
    public boolean empty() {
        return res.isEmpty();        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */