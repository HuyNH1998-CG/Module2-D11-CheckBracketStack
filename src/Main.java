import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a)) ";
        if (check(str)){
            System.out.println("well");
        } else {
            System.out.println("bad");
        }
    }

    static boolean check(String str) {
        Stack<Character> stack = new Stack<>();
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
