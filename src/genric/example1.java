package genric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class example1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Sandip");
        arrayList.add("Nikhil");
        arrayList.add("Shubham");
        arrayList.add("Shreyas");
        //String s=arrayList.get(3);
      //  System.out.println("Name:"+s);

//        Iterator<String> itr= arrayList.iterator();
//        if(itr.hasNext()){
//            System.out.println(itr.next());
        //}
//        for(int i=0;i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }
//        Collections.sort(arrayList);
//        for (String i:arrayList) {
//            System.out.println(i);
arrayList.remove(2);
        System.out.println(arrayList);
        }
    }

