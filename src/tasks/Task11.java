package tasks;

import java.io.*;

public class Task11 {
    public static void main(String[] args) {
//        Write a Java program to read a plain text file.
        File file = new File("d:/NewFile.txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            try {
                String line = br.readLine();
                while(line != null){
                    System.out.println(line);
                    line = br.readLine();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
