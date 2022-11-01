package genric;

import java.util.ArrayList;
import java.util.Iterator;

public class itrator {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(24);
        arr.add(9);
        arr.add(25);
        arr.add(5);
        arr.add(50);
        Iterator<Integer> it=arr.iterator();
        while(it.hasNext()){
            Integer i=it.next();
            if (i<10){
                it.remove();
            }
        }
        System.out.println(arr);
    }
}
//        myinterface inter=((a, b) ->{
//            return a+b;
//        });
//        System.out.println(inter.add(3,3));
//    }