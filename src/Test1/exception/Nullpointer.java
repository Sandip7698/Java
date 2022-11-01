package Test1.exception;

public class Nullpointer {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.charAt(5));
        }catch (NullPointerException e){
            System.out.println("String can not be null");

        }
    }
}
