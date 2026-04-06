class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n - 1;

        for(int i = 0; i < n; i++){
            if(numbers[left] + numbers[right] > target){
                numbers[right]--;
            }
            else if(numbers[left] + numbers[right] < target){
                numbers[left]++;
            }
            else{
                return new int[] {numbers[left], numbers[right]};
            }
        }
        return new int[] {};
    }
}
