class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();

        if(sl != tl){
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        int count = 1;

        for(int i = 0; i < sl; i++){
            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), count);
            }
            else{
                map1.replace(s.charAt(i), count, count++);
            }
        }

        for(int i = 0; i < tl; i++){
            if(!map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i), count);
            }
            else{
                map2.replace(t.charAt(i), count, count++);
            }
        }

        for(int i = 0; i < sl; i++){
            if(!(map1.get(s.charAt(i)) == map2.get(t.charAt(i)))){
               return true; 
            }
        }
        return false;
    }
}
