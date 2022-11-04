package task;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue=new LinkedList<>();
        Stack<Integer> stack = new Stack<Integer>();
        List<Integer> list=new ArrayList<Integer>();
        System.out.println("Enetr Size = ");
        int size = sc.nextInt();


        System.out.println("Eneter Queue Elements");
        for(int i=0;i<size;i++){
            queue.add(sc.nextInt());
        }


        System.out.println("Elements of Queue");

        System.out.println(queue);


        System.out.println("Eneter stack Elements");
        for (int j = 0; j < size; j++) {
            stack.push(sc.nextInt());
        }

        System.out.println("Elements of Stack");
        System.out.println(stack);


        System.out.println("Sum of the Queue and Stack");


        System.out.println("Reverse of List");
        Collections.reverse(stack);
        System.out.println(stack);

        System.out.println("2nd Last position Element");
        int last=stack.get(stack.size()-2);
        System.out.println(last);

        System.out.println("Sum of Stack");

        List<Integer> list1=new ArrayList<>();

        Object[] a =queue.toArray();
         int sum=0;

             for (int i : stack) {
                 for (int j : queue) {
                     sum = i + j;
                 }
             }

        System.out.println(sum);

    }
}
