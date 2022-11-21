import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<HashSet<Integer>,String> hashMap=new HashMap<HashSet<Integer>, String>();
        HashSet<Integer> key=new HashSet<>();
        key.add(1);
        System.out.println(key);
        hashMap.put(key,"Sandip");

        System.out.println(hashMap);
    }
    }

