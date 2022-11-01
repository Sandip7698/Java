package test.collections;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(2);
        System.out.println(list);
    }
}
