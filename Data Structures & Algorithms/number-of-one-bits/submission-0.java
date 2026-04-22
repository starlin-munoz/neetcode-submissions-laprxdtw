class Solution {
    public int hammingWeight(int n) {
        if(n == 0){
            return 0;
        }

        String result = "";
        while(n > 0){
            result = (n % 2) + result;
            n /= 2;
        }

        int count = 0;
        for(int i = 0; i < result.length(); i++){
            if(result.charAt(i) == '1'){
                count++;
            }
        }

        return count;
    }
}
