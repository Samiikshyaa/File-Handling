package tasks.com.file;

import java.io.*;

public class Question {
    public static void main(String[] args) {
//        write a program that store the text "Tribhuwan University" into file named "tu.txt" and read same file and display the content.
        File file = new File("D:/tu.txt");
        try {
            FileOutputStream fout = new FileOutputStream(file);
            String s = "Tribhuwan University";
            fout.write(s.getBytes());

            FileInputStream fin = new FileInputStream(file);
            int line;
            while((line = fin.read())!= -1){
                System.out.print((char)line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
