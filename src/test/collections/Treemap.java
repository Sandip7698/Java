package test.collections;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer,String> h1=new TreeMap<>();
        h1.put(101,"Harish");
        h1.put(103,"Omkar");
        h1.put(102,"sandip");
        System.out.println(h1.keySet());
    }
}
