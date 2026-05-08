class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int i : students){
            q.offer(i);
        }

        int i = 0;
        int count = 0;
        while(count < q.size()){
            if(q.peek() == sandwiches[i]){
                q.poll();
                count = 0;
                i++;
            }
            else{
                q.offer(q.poll());
                count++;
            }
        }

        return q.size();
    }
}