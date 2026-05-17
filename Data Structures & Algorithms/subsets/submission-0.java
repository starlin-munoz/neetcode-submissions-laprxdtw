class Solution {
    public void backtrack(List<Integer> current, int index, int[] nums, List<List<Integer>> res){
        res.add(new ArrayList<>(current));

        for(int i = index; i < nums.length; i++){
            current.add(nums[i]);
            backtrack(current, i+1, nums, res);
            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        backtrack(new ArrayList<>(), 0, nums, res);
        return res;
    }
}
