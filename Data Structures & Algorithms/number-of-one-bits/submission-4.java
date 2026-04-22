class Solution {
    public int hammingWeight(int n) {
        if(n == 0){
            return 0;
        }

        int count = 0;
        String result = "";
        while(n > 0){
            result = (n % 2) + result;
            if(n % 2 == 1){
                count++;
            }
            n /= 2;
        }

        return count;
    }
}
