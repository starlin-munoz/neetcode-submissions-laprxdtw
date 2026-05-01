class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];

        for(int i = 0; i < n; i++){
            int number = nums[i];
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        int c = 0;
        int maxFreq = -1;
        int maxKey = 0;

        while(c < k){
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() > maxFreq){
                    maxFreq = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            res[c] = maxKey;
            map.put(maxKey, 0);
            maxFreq = -1;
            c++;
        }  
        
        return res;
    }
}
