package filehandling;

public class FileWriter {
    public static void main(String[] args) throws Exception{

        java.io.FileWriter fw=new java.io.FileWriter("text.txt");
        fw.write("Welcome to javaTpoint.");
        System.out.println("File is write....");
        fw.close();
    }
    }


