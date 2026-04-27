class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                int element = grid[i][j];
                if(set.contains(element)){
                    res[0] = element;
                }
                else{
                    set.add(element);
                }
            }
        }

        double n = Math.pow(grid.length, 2);
        for(int i = 1; i <= n; i++){
            if(!set.contains(i)){
                res[1] = i;
            }
        }

        return res;
    }
}