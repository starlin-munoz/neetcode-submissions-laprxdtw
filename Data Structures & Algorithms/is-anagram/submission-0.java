class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();

        if(sl != tl){
            return false;
        }

        HashSet<Character> l1 = new HashSet<>();
        HashSet<Character> l2 = new HashSet<>();

        for(int i = 0; i < sl; i++){
            l1.add(s.charAt(i));
        }

        for(int i = 0; i < tl; i++){
            l2.add(t.charAt(i));
        }

        if(l1.equals(l2)){
            return true;
        }
        return false;
    }
}
