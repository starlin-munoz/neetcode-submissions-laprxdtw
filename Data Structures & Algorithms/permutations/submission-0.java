class Solution {
    public void backtrack(List<Integer> current, boolean[] used, int[] nums, List<List<Integer>> res){
        if(current.size() == nums.length){
            res.add(new ArrayList<>(current));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            current.add(nums[i]);

            backtrack(current, used, nums, res);

            current.remove(current.size() - 1);
            used[i] = false;
        }
    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(new ArrayList<>(), used, nums, res);
        return res;
    }
}
