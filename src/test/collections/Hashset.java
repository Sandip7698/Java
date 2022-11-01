package test.collections;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        s.add(2);
        s.add(5);
        s.add(76);
        s.add(2);
        System.out.println(s);
    }
}
