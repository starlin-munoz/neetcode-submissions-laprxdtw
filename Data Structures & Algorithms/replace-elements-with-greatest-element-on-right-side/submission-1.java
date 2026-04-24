class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        int max = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                max = Math.max(arr[j], max);
                res[i] = max;
            }
            max = 0;
        }

        res[n - 1] = -1;
        return res;
    }
}