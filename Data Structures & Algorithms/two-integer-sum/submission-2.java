class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n - 1; j++){
                if(nums[i] + nums[j] == target && i != j){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
