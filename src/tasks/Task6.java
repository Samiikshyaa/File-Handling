package tasks;

import java.io.File;
import java.util.Date;

public class Task6 {
    public static void main(String[] args) {
//        Write a Java program to get the last modified time of a file.
        File file = new File("d:/graphics");
        Date date = new Date(file.lastModified());
        System.out.println("The last modified time of the file is: " + date);

//        long dt = file.lastModified();
//
//        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(dt), ZoneId.systemDefault());
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd yyyy | hh:mm:ss a");
//        System.out.println("The file was modified in: "+ dateTime.format(format));

    }
}
