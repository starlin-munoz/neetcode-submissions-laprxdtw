class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int count = 0;
        char prev = s.charAt(n - 1);
        
        for(int i = n - 2; i > 0; i--){
            char curr = s.charAt(i);
            if(prev == curr){
                count++;
            }
            prev = curr;
        }

        return count;
    }
}