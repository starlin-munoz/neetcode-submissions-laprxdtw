class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        int end = n - 1;
        int i = 0;

        while(i <= end){
            if(nums[i] == val){
                nums[i] = nums[end];
                end--;
            }
            else{
                i++;
                count++;
            }
        }
        return count;
    }
}