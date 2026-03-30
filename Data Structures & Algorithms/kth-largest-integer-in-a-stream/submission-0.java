class KthLargest {
    PriorityQueue<Integer> l = new PriorityQueue<>();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i : nums){
            add(i);
        }
    }
    
    public int add(int val) {
        l.add(val);
        if(l.size() > k){
            l.poll();
        }
        return l.peek();
    }
}
