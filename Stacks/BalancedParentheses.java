import java.util.*;
public class BalancedParentheses{
    public static String checkBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !isMatching(stack.pop(), c)) {
                    return "No";
                }
            }
        }

        if (stack.isEmpty()) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static boolean isMatching(char open, char clos) {
        if (open == '(' && clos == ')') {
            return true;
        } else if (open == '{' && clos == '}') {
            return true;
        } else if (open == '[' && clos == ']') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String res = checkBalanced(s);
        System.out.println(res);
    }
}
