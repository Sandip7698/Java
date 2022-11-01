package test.collections;

import java.util.ArrayList;

public class ArrayLisDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList.contains(5));
        System.out.println(arrayList);
    }
}
