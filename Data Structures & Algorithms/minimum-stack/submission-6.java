class MinStack {
    int min;
    Stack<Integer> s;
    Stack<Integer> mins = new Stack<>();

    public MinStack() {
        s = new Stack<Integer>();
    }
    
    public void push(int val) {
        s.push(val);
        if(s.size() == 1){
            min = val;
            mins.push(min);
        }
        else if(val <= min){
            mins.push(val);
        }
    }
    
    public void pop() {
        if(s.pop() == mins.peek()){
            mins.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        if(mins.isEmpty()){
            return 0;
        }
        return mins.peek();
    }
}
