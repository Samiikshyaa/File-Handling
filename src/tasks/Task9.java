package tasks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) throws IOException {
//        Write a Java program to read contents from a file into byte array.
        File file = new File("d:/NewFile.txt");
        byte[] getBytes = Files.readAllBytes(file.toPath());

        for(byte b : getBytes){
            System.out.println((char) b +" : "+b);
        }








////        FileReader fr = new FileReader(file);
////        BufferedReader bf = new BufferedReader(fr);
////        String lines = bf.readLine();
//        List<String> lines = new ArrayList<>();
//        Scanner sc = new Scanner(file);
//        while (sc.hasNextLine()) {
//            lines.add(sc.nextLine());
//        }
//        String[] arr = lines.toArray(new String[0]);

    }
}
