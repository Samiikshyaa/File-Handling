package tasks;

import java.io.File;

public class Task8 {
    public static void main(String[] args) {
        File file = new File("d:/NewFile.txt");
        System.out.println(file.length()+ " byte");
        double fileinKB =(double)(file.length()/1024.0);
        System.out.println(fileinKB+ " KB");
        double fileinMB =(double) (file.length()/(1024.0*1024.0));
        System.out.println(fileinMB+ " MB");
    }
}
