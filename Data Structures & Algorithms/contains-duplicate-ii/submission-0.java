class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> index = new HashMap<>();

        for(int i = 0; i < n; i++){
            int num = nums[i];
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if(freq.get(num) == 2){
                if(Math.abs(index.get(num) - i) <= k){
                    return true;
                }
            }
            index.put(num, i);
        }

        return false;
    }
}