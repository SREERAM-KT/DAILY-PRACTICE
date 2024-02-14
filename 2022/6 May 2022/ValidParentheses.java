import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()) {
            if( (!stk.isEmpty()) &&
                    ((ch == ')' && stk.peek() == '(') ||
                            (ch == '}' && stk.peek() == '{') ||
                            (ch == ']' && stk.peek() == '[')))
                stk.pop();
            else if(ch == '(' || ch == '[' || ch == '{')
                stk.push(ch);
            else return false;
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.next();
        System.out.println(isValid(string));
    }
}