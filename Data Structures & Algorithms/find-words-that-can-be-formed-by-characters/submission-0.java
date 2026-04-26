class Solution {
    public int countCharacters(String[] words, String chars) {
        HashSet<Character> word = new HashSet<>();
        for(char i : chars.toCharArray()){
            word.add(i);
        }

        int count = 0;
        boolean valid = true;
        for(String s : words){
            for(int i = 0; i < s.length(); i++){
                if(!word.contains(s.charAt(i))){
                    valid = false;
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