package test.collections;

import java.util.LinkedHashMap;

public class Linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> h=new LinkedHashMap<>();
        h.put(101,"Harish");
        h.put(102,"Omkar");
        h.put(103,"sandip");
        System.out.println(h.keySet());
        System.out.println(h.values());
    }
}
