import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any No:");
        int n=sc.nextInt();
        for (int i=n;i>=1;i--){
            System.out.println(i);
        }

    }
}
