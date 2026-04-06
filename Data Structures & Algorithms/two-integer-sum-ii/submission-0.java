class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            int t = target - numbers[i];
            if(map.containsKey(t)){
                return new int[] {map.get(t), numbers[i]};
            }
            map.put(numbers[i], numbers[i]);
        }
        return new int[] {};
    }
}
