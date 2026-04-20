class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < s1.length(); i++){
            set.add(s1.charAt(i));
        }

        int p = 0;
        for(int i = 0; i < s2.length(); i++){
            if(set.contains(s2.charAt(i))){
                p = i;
                break;
            }
        }

        for(int i = p; i < p + s1.length(); i++){
            if(!set.contains(s2.charAt(i))){
                return false;
            }
            else{
                set.remove(s2.charAt(i));
            }
        }
        return true;
    }
}
