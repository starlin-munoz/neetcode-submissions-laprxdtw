class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }

        int r = s.length() - 1;
        for(int l = 0; l < s.length(); l++){
            if(s.charAt(l) == '(' && s.charAt(r) != ')' || 
            s.charAt(l) == '{' && s.charAt(r) != '}' ||
            s.charAt(l) == '[' && s.charAt(r) != ']'){
                return false;
            }
            r--;
        }
        return true;
    }
}
