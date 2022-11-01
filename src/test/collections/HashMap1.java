package test.collections;
import java.util.HashMap;
public class HashMap1{
    public static void main(String[] args) {
        HashMap<Integer,String> h2=new HashMap<>();
        h2.put(1,"Sandip");
        h2.put(2,"Nikhil");
        h2.put(3,"Shubham");
        h2.put(4,"Shreyas");
        System.out.println(h2.get(3));
    }
}
