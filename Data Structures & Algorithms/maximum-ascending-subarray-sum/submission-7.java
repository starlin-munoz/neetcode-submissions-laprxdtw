class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int sum = 0;
        int prev = nums[nums.length - 1];
        sum += prev;

        for(int i = nums.length - 2; i >= 0; i--){
            int current = nums[i];
            if(current < prev){
                sum += current;
                prev = current;
            }
            else{
                max = Math.max(sum, max);
                sum = current;
                prev = current;
            }
        }
        return Math.max(sum, max);
    }
}