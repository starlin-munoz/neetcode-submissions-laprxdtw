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
        if(val < min){
            mins.push(val);
        }
    }
    
    public void pop() {
        s.pop();
        if(!mins.isEmpty()){
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
