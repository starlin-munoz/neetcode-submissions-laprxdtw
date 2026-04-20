class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 1;
        int max = 0;

        HashSet<Character> set = new HashSet<>();

        if(s.length() == 0){
            return 0;
        }

        set.add(s.charAt(0));

        for(int i = 1; i < s.length(); i++){
            if(!set.contains(s.charAt(i))){
                count++;
                set.add(s.charAt(i));
            }
            else{
                set.clear();
                max = Math.max(max, count);
                count = 0;
            }
        }

        return Math.max(count, max);
    }
}
