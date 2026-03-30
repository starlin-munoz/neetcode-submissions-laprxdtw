class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1){
            return true;
        }

        String lowerS = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                lowerS += s.toLowerCase().charAt(i);
            }
        }

        int r = lowerS.length() - 1;
        for(int l = 0; l < lowerS.length(); l++){
            if(lowerS.charAt(r) != lowerS.charAt(l)){
                return false;
            }
            r--;
        }
        return true;
    }
}
