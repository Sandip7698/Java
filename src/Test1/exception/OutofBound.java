package Test1.exception;



public class OutofBound {
    public static void main(String[] args) {
        try {
            String name = "sandip jadhav";

            System.out.println(name.charAt(25));
        }catch (Exception e){
            System.out.println("String is not present");
        }
    }
}