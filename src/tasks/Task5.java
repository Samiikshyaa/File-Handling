package tasks;

import java.io.File;

public class Task5 {
    public static void main(String[] args) {
//        Write a Java program to check if a given pathname is a directory or a file.
        File file = new File("d:/graphics/2D.C");
        if (file.isDirectory()){
            System.out.println(file + " is directory.");
        } else if (file.isFile()) {
            System.out.println(file +" is a file");
        } else {
            System.out.println("The file is neither the file nor the directory.");
        }
    }
}
