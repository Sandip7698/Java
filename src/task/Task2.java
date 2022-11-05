package task;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        ArrayList li=new ArrayList();
        System.out.println("Enter the Size =");
        int size=sc.nextInt();
        for (int i=1;i<=size;i++){
                System.out.println("Eneter the Name : ");
                String name = sc.next();
                map.put(i, name);

        }
        li.add(map);
        System.out.println(li);


    }
}
