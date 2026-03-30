class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<>();
        if(s.length() % 2 != 0){
            return false;
        }

        stack1.push(s.charAt(0));

        for(int i = 1; i < s.length(); i++){
            if(stack1.isEmpty()){
                continue;
            }
            if(stack1.peek() == '[' && s.charAt(i) == ']' ||
            stack1.peek() == '{' && s.charAt(i) == '}' ||
            stack1.peek() == '(' && s.charAt(i) == ')'){
                stack1.pop();
            }
            else{
                stack1.push(s.charAt(i));
            }
        }

        if(stack1.isEmpty()){
            return true;
        }
        return false;
    }
}
