package tasks;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyTask {
    public static void main(String[] args) throws IOException {
        System.out.println("write here: ");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String lines = br.readLine();

        FileWriter file = new FileWriter("d:/NewFile.txt");
        file.write(lines);
        file.close();
        System.out.println("File created and written.");
    }
}
