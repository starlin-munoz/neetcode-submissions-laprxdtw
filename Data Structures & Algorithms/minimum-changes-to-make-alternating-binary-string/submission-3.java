class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int count = 0;
        String c = "";
        char start = s.charAt(0);
        for(int i = 0; i < n; i++){
            if(start == '0'){
                if(i % 2 == 0){
                    c += "0";
                }
                else{
                    c += "1";
                }
            }
            else{
                if(i % 2 == 0){
                    c += "1";
                }
                else{
                    c += "0";
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != c.charAt(i)){
                count++;
            }
        }

        return Math.min(count, n - count);
    }
}