package genric;

import java.util.Stack;

public class example2 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(12);
        stack.push(14);
        stack.pop();
        stack.push(34);

        System.out.println(stack);
    }
}
