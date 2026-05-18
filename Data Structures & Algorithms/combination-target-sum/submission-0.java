class Solution {

    public void backtrack(List<Integer> current, int[] candidates, int target, int index, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(current));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = index; i < candidates.length; i++){
            current.add(candidates[i]);
            int newTarget = target - candidates[i];
            backtrack(current, candidates, newTarget, i, res);
            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(new ArrayList<>(), candidates, target, 0, res);
        return res;
    }
}