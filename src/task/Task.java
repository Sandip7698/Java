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

        Integer[] arr=new Integer[queue.size()];
        arr=queue.toArray(arr);

        List<Integer> result=Arrays.asList(arr);

        List<Integer> result1=new ArrayList<>();

        int k=result.size();
            for(int j=0;j< result.size();j++){
                result1.add(result.get(j)+stack.get(--k));
        }
        System.out.println(result1);

      System.out.println("Reverse of List");
        Collections.reverse(result1);
        System.out.println(result1);

        System.out.println("2nd Last position Element");
        int last=result1.get(result1.size()-2);
        System.out.println(last);
    }
}
