import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any no");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Even No");
        }else {
            System.out.println("Odd No");
        }

    }
}
