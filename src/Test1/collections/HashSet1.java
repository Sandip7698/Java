package Test1.collections;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> h1=new HashSet<>();
        h1.add("Sandip");
        h1.add("Nikhil");
        h1.add("Shubham");
        h1.add("Sandip");
        System.out.println(h1);
    }
}
