class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int k = 1;
        int index = 0;
        boolean b = true;
        int c = 0;
        int[] pile = new int[n];

        while(b){
            if(index == 0 && c == 0){
                for(int i = 0; i < n; i++){
                    pile[i] = piles[i];
                }
            }

            pile[index] -= k;

            if(pile[index] <= 0){
                index++;
            }

            c++;

            if(c > h){
                k++;
                index = 0;
                c = 0;
            }
            else if(c <= h && pile[n - 1] <= 0){
                b = false;
            }
        }

        return k;
    }
}
