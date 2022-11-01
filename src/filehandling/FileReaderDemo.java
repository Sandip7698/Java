package filehandling;

import java.io.File;
import java.util.Scanner;

public class FileReaderDemo {
    public static void main(String[] args) {
        try{
            File file=new File("text.txt");
            Scanner sc=new Scanner(file);
            while (sc.hasNext()){
                String data=sc.nextLine();
                System.out.println(data);

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
