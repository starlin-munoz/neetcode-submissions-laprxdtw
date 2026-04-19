class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(!set.contains(n)){
            set.add(n);
            n = sumOfSquares(n);

            if(n == 1){
                return true;
            }
        }
        return false;
    }

    public int sumOfSquares(int n){
        int output = 0;

        while(n != 0){
            int digit = n % 10;
            digit = (int)Math.pow(digit, 2);
            output += digit;
            n = n / 10;
        }
        return output;
    }
}
