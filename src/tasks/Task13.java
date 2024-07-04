package tasks;

import java.io.*;

public class Task13{
    public static void main(String[] args) throws IOException {
//        Write a Java program to append text to an existing file.
        FileWriter file = new FileWriter("d:/NewFile.txt", true);
        String text = "Hello";
        file.write(text);
        file.close();
        System.out.println("The text is appende to an existing file");
    }
}
