class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = (rows * cols) - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            int middle = matrix[mid / cols][mid % cols];
            if(target < middle){
                high = mid - 1;
            }
            else if(target > middle){
                low = mid + 1;
            }
            else{
                return true;
            }
        }

        return false;
    }
}
