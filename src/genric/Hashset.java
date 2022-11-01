package genric;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hash=new HashSet<>();
        hash.add(2);
        hash.add(5);
        hash.add(76);
        hash.add(2);
        System.out.println(hash);
//        System.out.println(hash.contains(2));
//        for (int i=0;i<=10;i++){
//            if (hash.contains(i)){
//                System.out.println("Item is found");
//            }else {
//                System.out.println("Not Found");
//            }
//        }

    }
}
