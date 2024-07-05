package tasks;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws IOException {
//        Write a Java program to read input from the java console.
        System.out.println("Write here: ");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String line = br.readLine();
        System.out.println("Reading..");
        System.out.println(line);
    }

}
