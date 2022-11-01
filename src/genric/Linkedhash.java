package genric;

import java.util.LinkedHashMap;

public class Linkedhash {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> h1=new LinkedHashMap<>();
        h1.put(1,"Harish");
        h1.put(2,"Omkar");
        System.out.println(h1.keySet()+ " "+h1.values());


    }
}
