class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();

        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }

        int result = 0;
        int leftBorder = 0;
        for(int rightBorder = 0; rightBorder < n; rightBorder++){
            if(!set.contains(s.charAt(rightBorder))){
                set.add(s.charAt(rightBorder));
            }
            else{
                while(s.charAt(leftBorder) != s.charAt(rightBorder)){
                    set.remove(s.charAt(leftBorder));
                    leftBorder++;
                }
                set.remove(s.charAt(leftBorder));
                leftBorder++;
                set.add(s.charAt(rightBorder));
            }
            result = Math.max(result, rightBorder - leftBorder + 1);
        }
        return result;
    }
}
