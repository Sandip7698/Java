package Test1.exception;
import java.io.FileNotFoundException;
import java.io.FileReader;
;

public class FileNotFound {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\admin\\Desktop\\");
            System.out.println(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("File is not present");
        }
    }
}