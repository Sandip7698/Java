package Test1.exception;

public class Arrayoutofbound {
    public static void main(String[] args) {
        try {
            int arr[] = new int[4];
            arr[5] = 3;
   }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Size is excessed");
        }

    }
}
