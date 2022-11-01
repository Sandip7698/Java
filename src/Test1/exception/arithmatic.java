package Test1.exception;

import java.util.Scanner;

public class arithmatic {
    public static void main(String[] args) {
        int x =5;
        int y=0;
        try {
            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("Not Divide by 0");
        }
    }
}
