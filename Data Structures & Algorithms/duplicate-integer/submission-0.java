class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i, 0);
            }
            else{
                map.replace(i, 1);
            }
        }

        for(int i : nums){
            if(map.get(i) == 1){
                return true;
            }
        }
        return false;
    }
}