package tasks.com.file;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("D://something.txt");
        try{
//            FileOutputStream fout = new FileOutputStream(file);
//            String txt = "Hello Samikshya! This is File handling.";
//            fout.write(txt.getBytes());
//            fout.close();

            FileInputStream fin = new FileInputStream(file);
            int c = 0;
            while ((c = fin.read()) != -1){
                System.out.print((char) c);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
