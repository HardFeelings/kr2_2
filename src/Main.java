import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(isValidParentheses("()"));
        System.out.println(isValidParentheses("(()()((())))"));
        System.out.println(isValidParentheses("(((()))()"));
        System.out.println(isValidParentheses(")("));
        System.out.println(isValidParentheses("(((())))()()"));
    }

    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}