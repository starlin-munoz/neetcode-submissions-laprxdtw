class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(char i : chars.toCharArray()){
            charCount.put(i, charCount.getOrDefault(i, 0) + 1);
        }

        int count = 0;
        boolean valid = true;
        for(String s : words){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(!charCount.containsKey(c)){
                    valid = false;
                    break;
                }
                map.put(c, map.getOrDefault(c, 0) + 1);
                if(map.get(c) > charCount.get(c)){
                    valid = false; 
                    break;
                }
            }
            if(valid){
                count += s.length();
            }
            valid = true;
        }
        return count;
    }
}