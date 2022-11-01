package practice;

import java.util.ArrayList;

public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        array.add(5);
        array.add(6);
        array.add(7);
        System.out.println(array);
        System.out.println(array.size());
        System.out.println(array.contains(6));
        System.out.println(array.clone());
        System.out.println(array.get(2));
        System.out.println(array.indexOf(6));
    }
}
