class Solution {
    public boolean isValid(String exp) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)=='(' || exp.charAt(i)=='[' || exp.charAt(i)=='{')
                stack.push(exp.charAt(i));
            else if(exp.charAt(i)==')' || exp.charAt(i)==']' || exp.charAt(i)=='}'){
                if(stack.empty())
                    return false;
                Character alpha = stack.pop();
                if(alpha == '('){
                    if(exp.charAt(i) != ')')
                        return false;
                }
                if(alpha == '['){
                    if(exp.charAt(i) != ']')
                        return false;
                }
                if(alpha == '{'){
                    if(exp.charAt(i) != '}')
                        return false;
                }
            }
        }
        if(!stack.empty())
            return false;
        return true;
        
    }
}
