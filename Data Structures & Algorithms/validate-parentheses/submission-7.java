class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<>();
        if(s.length() % 2 != 0){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '[' || 
            s.charAt(i) == '{' || 
            s.charAt(i) == '('){
                stack1.push(s.charAt(i));
            }
            else if(s.charAt(i) == ']' || 
            s.charAt(i) == '}' || 
            s.charAt(i) == ')'){
                if(stack1.isEmpty()){
                    return false;
                }
                if(stack1.peek() == '[' && s.charAt(i) == ']' ||
                stack1.peek() == '{' && s.charAt(i) == '}' ||
                stack1.peek() == '(' && s.charAt(i) == ')'){
                    stack1.pop();
                }
            }
        }

        if(stack1.isEmpty()){
            return true;
        }
        return false;
    }
}
