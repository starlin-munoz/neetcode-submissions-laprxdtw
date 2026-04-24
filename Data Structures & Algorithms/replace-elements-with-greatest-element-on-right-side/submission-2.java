class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        int rightMax = -1;
        int newMax;

        for(int i = n - 1; i >= 0; i--){
            newMax = Math.max(rightMax, arr[i]);
            res[i] = rightMax;
            rightMax = newMax;
        }

        return res;
    }
}