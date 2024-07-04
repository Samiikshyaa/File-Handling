package tasks;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
//        Write a Java program to get a list of all file/directory names from the given.
        File obj = new File("d:/");
        String[] lists = obj.list();

        for(String name: lists){
            System.out.println(name);
        }

//        Write a Java program to get specific files by extensions from a specified folder.
        File obj2 = new File("d:/graphics");
        String[] namesOfFiles = obj2.list();
        List<String> names = Arrays.asList(namesOfFiles);
        String extension = ".pdf";
        for (String name : names){
            if(name.toLowerCase().endsWith(extension)){
                System.out.println("\nThe file with \'"+extension+"\' in \'"+ obj2 +"\' is:  "+name);
            }
        }
    }

}
