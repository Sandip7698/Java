package genric;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> no=new LinkedList<>();
        no.add(23);
        no.add(25);
        no.add(39);
        no.add(54);


       // no.addFirst(22);
        //no.addLast(28);
       // no.removeFirst();
        //no.removeLast();
       // no.getFirst();
        no.getLast();
        System.out.println(no);
    }
}
