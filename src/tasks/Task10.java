package tasks;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) throws IOException {
//        Write a Java program to read a file content line by line.


//        File file = new File("d:/NewFile.txt");
//        FileReader fr = new FileReader(file);
//        BufferedReader br = new BufferedReader(fr);
//        String line = br.readLine();
//        while(line!= null){
//            System.out.println(line);
//            line = br.readLine();
//        }

//        OR====================================================================================

        Scanner sc = new Scanner(new File("d:/NewFile.txt"));
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
