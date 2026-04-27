class Solution {
    public int findLucky(int[] arr) {
        int res = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int count = -1;
        for(int i : arr){
            if(map.get(i) == i){
                count = i;
            }
            res = Math.max(count, res);
        }

        return Math.max(count, res);
    }
}