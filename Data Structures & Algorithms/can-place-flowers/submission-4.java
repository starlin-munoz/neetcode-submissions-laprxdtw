class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        int res = 0;

        int prev = 0;
        for(int i = l - 1; i >= 0; i--){
            int current = flowerbed[i];
            if(prev == 0 && current == 0){
                res++;
                flowerbed[i] = 1;
            }
            prev = flowerbed[i];
        }

        if(res >= n){
            return true;
        }
        return false;
    }
}