class Solution {
    public int heightChecker(int[] heights) {
        int res = 0;
        PriorityQueue<Integer> l = new PriorityQueue<>();
        for(int i : heights){
            l.add(i);
        }

        for(int i : heights){
            if(l.poll() != i){
                res++;
            }
        }

        return res;
    }
}