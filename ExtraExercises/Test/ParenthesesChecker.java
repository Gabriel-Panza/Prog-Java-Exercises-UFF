import java.util.*;

public class ParenthesesChecker {
    public static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();

        for (char c : parentheses.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty()) {
                stack.pop();
            } else {
                return false; // Unmatched closing parenthesis or extra closing parenthesis
            }
        }

        return stack.isEmpty(); // Stack should be empty for balanced parentheses
    }

    public static void main(String[] args) {
        String balancedParentheses = "((()))";
        String unbalancedParentheses = "()(()";

        System.out.println("Balanced: " + isBalanced(balancedParentheses));
        System.out.println("Balanced: " + isBalanced(unbalancedParentheses));
    }
}
