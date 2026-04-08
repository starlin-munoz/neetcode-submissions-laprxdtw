class MinStack {
    int min;
    Stack<Integer> s;

    public MinStack() {
        s = new Stack<Integer>();
    }
    
    public void push(int val) {
        s.push(val);
        if(s.size() == 1){
            min = val;
        }
        for(int i : s){
            if(i < min){
                min = i;
            }
        }
    }
    
    public void pop() {
        s.pop();
        if(s.size() > 0){
            min = s.peek();
        }
        for(int i : s){
            if(i < min){
                min = i;
            }
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min;
    }
}
