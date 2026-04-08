class MinStack {
    int min;
    Stack<Integer> s;
    Stack<Integer> mins = new Stack<>();

    public MinStack() {
        s = new Stack<Integer>();
    }
    
    public void push(int val) {
        s.push(val);
        if(s.size() == 1 || val < min){
            min = val;
            mins.push(min);
        }
    }
    
    public void pop() {
        if(s.pop().equals(mins.peek())){
            mins.pop();
        }

        if(!mins.isEmpty()){
            min = mins.peek();
        }
        else{
            min = Integer.MAX_VALUE;
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
