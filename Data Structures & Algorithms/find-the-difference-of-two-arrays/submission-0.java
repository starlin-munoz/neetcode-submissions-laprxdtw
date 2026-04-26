class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();

        HashSet<Integer> n2 = new HashSet<>();
        for(int i : nums2){
            n2.add(i);
        }

        for(int i : nums1){
            if(!n2.contains(i) && !l1.contains(i)){
                l1.add(i);
            }
        }

        res.add(l1);

        List<Integer> l2 = new ArrayList<>();

        HashSet<Integer> n1 = new HashSet<>();
        for(int i : nums1){
            n1.add(i);
        }

        for(int i : nums2){
            if(!n1.contains(i) && !l2.contains(i)){
                l2.add(i);
            }
        }

        res.add(l2);

        return res;
    }
}