class Solution {
    public int[] mergeSort(int[] array){
        int size = array.length;

        if(size < 2){
            return array;
        }

        int half = size / 2;

        int[] leftSide = new int[half];
        int[] rightSide = new int[size - half];

        for(int i = 0; i < half; i++){
            leftSide[i] = array[i];
        }

        for(int i = half; i < size; i++){
            rightSide[i - half] = array[i];
        }

        mergeSort(leftSide);
        mergeSort(rightSide);

        return merge(array, leftSide, rightSide);
    }

    public int[] merge(int[] array, int[] leftSide, int[] rightSide){
        int leftSize = leftSide.length;
        int rightSize = rightSide.length;
        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize){
            if(leftSide[i] < rightSide[j]){
                array[k] = leftSide[i];
                i++;
            }
            else{
                array[k] = rightSide[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            array[k] = leftSide[i];
            i++;
            k++;
        }

        while(j < rightSize){
            array[k] = rightSide[j];
            j++;
            k++;
        }

        return array;
    }

    public int lastStoneWeight(int[] stones) {
        int n = stones.length;

        if(n == 1){
            return stones[0];
        }

        while(true){
            int count = 0;
            stones = mergeSort(stones);
            int x = stones[n - 1];
            int y = stones[n - 2];

            if(x == y){
                stones[n - 1] = -1;
                stones[n - 2] = -1;
            }
            else if(x < y){
                stones[n - 2] = y - x;
                stones[n - 1] = -1;
            }
            else{
                stones[n - 1] = x - y;
                stones[n - 2] = -1;
            }

            for(int i : stones){
                if(i == -1){
                    count++;
                }
            }

            if(count >= n - 1){
                break;
            }
        }

        for(int i : stones){
            if(i != -1){
                return i;
            }
        }
        return 0;
    }
}
