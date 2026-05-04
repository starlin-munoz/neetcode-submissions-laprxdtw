class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        for(int i : nums1){
            n1.add(i);
        }

        for(int i : nums2){
            if(n1.contains(i) && !res.contains(i)){
                res.add(i);
            }
        }

        int[] result = new int[res.size()];
        int index = 0;
        for(int i : res){
            result[index] = i;
            index++;
        }  
        return result;     
    }
}