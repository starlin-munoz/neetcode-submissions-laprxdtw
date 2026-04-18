class Solution {
    public int missingNumber(int[] nums) {
    int n = nums.length; 
    int realSum = 0;
    int sum = 0;

    for(int i = 0; i <= n; i++){
        realSum += i;
    }

    for(int i : nums){
        sum += i;
    }

    return realSum - sum;
}
}

