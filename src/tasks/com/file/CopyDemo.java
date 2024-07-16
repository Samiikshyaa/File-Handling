package tasks.com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CopyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
        String fname = sc.nextLine();
        System.out.println("Enter the extension of the file");
        String extension = sc.nextLine();
        try {
            File file = new File("D://" + fname + "." + extension);
            FileInputStream fileInputStream = new FileInputStream(file);
            int c = 0;
            System.out.println("Enter the new filename: ");
            String newFileName = sc.nextLine();
            FileOutputStream fileOutputStream = new FileOutputStream("D://"+newFileName+"."+extension);

            FileOutputStream fout = new FileOutputStream("D://");
            while ((c=fileInputStream.read())!=-1){
                System.out.println(c);
                fileOutputStream.write(c);
            }

            fileInputStream.close();
            fileOutputStream.close();
            System.out.println("File copied with name "+newFileName+"."+extension+" in D: drive");

            if(file.exists()){
                file.delete();
            }
            System.out.println("File moved");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
