package filehandling;

import java.io.File;

public class FileCreate {
    public static void main(String[] args) {
        try{
            File file=new File("text.txt");
            System.out.println("File is created");
            System.out.println(file.getName());
        }catch (Exception e){
            System.out.println("File is not created");
        }
    }
}
