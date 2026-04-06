class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : numbers){
            map.put(i, i);
        }

        for(int i : numbers){
            int t = target - i;
            if(map.containsKey(target - i)){
                return new int[] {i, map.get(t)};
            }
        }
        return new int[] {};
    }
}
