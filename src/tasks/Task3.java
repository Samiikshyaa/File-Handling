package tasks;

import java.io.File;

public class Task3 {
    public static void main(String[] args) {
//        Write a Java program to check if a file or directory specified by pathname exists or not.
        File file = new File("d:/graphics/2D.C");
        if(file.exists()){
            System.out.println(file+" exists.");
        }else{
            System.out.println(file+" does not exist.");
        }
    }
}
