class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int zeroCounter = 0;
        int res = 0;

        for(int i : flowerbed){
            if(i == 0){
                zeroCounter++;
            }
            else{
                zeroCounter = 0;
            }

            if(zeroCounter == 2){
                res++;
                zeroCounter = 0;
            }
        }

        if(res == n){
            return true;
        }
        return false;
    }
}