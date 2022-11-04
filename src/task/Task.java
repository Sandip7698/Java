package task;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue=new LinkedList<>();
        Stack<Integer> stack = new Stack<Integer>();
        List<Integer> list=new ArrayList<Integer>();
        System.out.println("Eneter Size = ");
        int size = sc.nextInt();

        System.out.println("************************************************");
        System.out.println("Eneter Queue Elements");
        for(int i=0;i<size;i++){
            queue.add(sc.nextInt());
        }

        System.out.println("************************************************");
        System.out.println("Elements of Queue");

        System.out.println(queue);

        System.out.println("************************************************");
        System.out.println("Eneter stack Elements");
        for (int j = 0; j < size; j++) {
            stack.push(sc.nextInt());
        }
        System.out.println("************************************************");
        System.out.println("Elements of Stack");
        System.out.println(stack);

        System.out.println("************************************************");
        System.out.println("Sum of the Queue and Stack");




    }
}
