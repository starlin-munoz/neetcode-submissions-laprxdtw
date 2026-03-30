class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        while(low <= high){
            int middle = low + (high - low) / 2;
            if(nums[middle] < target){
                low = middle + 1;
            }
            else if(nums[middle] > target){
                high = middle - 1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}
