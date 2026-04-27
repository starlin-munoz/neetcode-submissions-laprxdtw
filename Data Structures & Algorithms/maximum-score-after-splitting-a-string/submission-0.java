class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int max = 0;
        String left = "";
        String right = "";
        int count = 0;
        for(int i = 1; i < n; i++){
            left = s.substring(0, i);
            right = s.substring(i);
            int zeroCount = 0;
            int oneCount = 0;
            for(int j = 0; j < left.length(); j++){
                if(left.charAt(j) == '0'){
                    zeroCount++;
                }
            }
            for(int k = 0; k < right.length(); k++){
                if(right.charAt(k) == '1'){
                    oneCount++;
                }
            }
            count = zeroCount + oneCount;
            max = Math.max(max, count); 
        }

        return Math.max(max, count);
    }
}