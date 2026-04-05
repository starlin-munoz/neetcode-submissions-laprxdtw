class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int total = 1;
        int[] result = new int[n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){  
                if(i != j){
                    total *= nums[j];
                }
            } 
            result[i] = total;
            total = 1;
        }

        return result;
    }   
}  
