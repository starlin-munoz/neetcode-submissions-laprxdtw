class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean monoIncreasing = true;
        boolean monoDecreasing = true;

        if(n == 1){
            return true;
        }

        int prev = nums[0];
        for(int i = 1; i < n; i++){
            int current = nums[i];
            if(!(prev <= current)){
                monoIncreasing = false;
            }
            else{
                monoDecreasing = false;
            }
            prev = current;
        }

        return monoIncreasing || monoDecreasing;
    }
}