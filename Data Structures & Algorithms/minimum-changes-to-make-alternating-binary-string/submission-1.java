class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int count = 0;
        char prev = s.charAt(0);
        
        for(int i = 1; i < n; i+=2){
            char curr = s.charAt(i);
            if(curr == prev){
                count++;
            }
            if(i == n - 1){
                break;
            }
            prev = s.charAt(i + 1);
        }

        return count;
    }
}