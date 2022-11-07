package task;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        ArrayList li = new ArrayList();
        System.out.println("Enter the Size =");
        int size = sc.nextInt();
        String name;
        int key;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <=3; j++) {
                System.out.println("Enter the Key : ");
                 key = sc.nextInt();
                System.out.println("Enter the Name : ");
                name = sc.next();
                map.put(key, name);
                System.out.println(map);

            }

            li.add(map);
//            System.out.println(li);
        }
        System.out.println(li);




        }
    }

