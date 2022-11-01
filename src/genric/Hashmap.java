package genric;

import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {
        HashMap<String,String> capital=new HashMap<String,String>();
        capital.put("INDIA","Delhi");
        capital.put("Maharashtra","Mumbai");
        capital.put("Karnataka","Banguluru");
        //System.out.println(capital.get("Maharashtra"));
        //capital.get("Mumbai");
//        for (String i: capital.keySet()) {
//            System.out.println(i);
//
//        }
//        for (String i: capital.values()) {
//            System.out.println(i);
//
//        }
        for (String i: capital.keySet()) {
            System.out.println("key: "+i+"  value: "+capital.get(i));

        }
    }
}
