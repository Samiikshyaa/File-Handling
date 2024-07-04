package tasks;

import java.io.File;

public class Task4 {
    public static void main(String[] args) {
//        Write a Java program to check if a file or directory has read and write permission.
        File file = new File("d:/graphics/");
        if (file.canRead()) {
            System.out.println(file + " can be read");
        } else {
            System.out.println(file + " cannot be read");
        }

        if (file.canWrite()) {
            System.out.println(file + " can be written");
        } else {
            System.out.println(file + " cannot be written");
        }
    }
}
