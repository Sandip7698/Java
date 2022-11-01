package Test1.collections;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> h=new HashMap<>();
        h.put(1,"Sandip");
        h.put(2,"Nikhil");
        h.put(3,"Shubham");
        h.put(4,"Omkar");
        System.out.println(h.get(4));
    }
}
