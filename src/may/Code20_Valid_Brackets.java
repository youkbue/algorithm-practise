package may;

import java.util.Stack;

/**
 * <p> 题号20：有效括号 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/25 16:20
 */
public class Code20_Valid_Brackets {

    public boolean isValid(String s) {
        if(s.isEmpty()) return true;
        Stack<Character> stack = new Stack<>();
        for(char i : s.toCharArray()){
            if(i == '(') stack.push(')');
            else if(i == '{') stack.push('}');
            else if (i == '[') stack.push(']');
            else if(stack.isEmpty() || i != stack.pop()) return false;
        }
        return stack.isEmpty();
    }
}
