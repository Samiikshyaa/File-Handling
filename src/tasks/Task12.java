package tasks;

import java.io.*;

public class Task12 {

    public static void main(String[] args) throws IOException {
        //    Write a java program to read a file line by line and store it into a variable
        File file = new File("d:/NewFile.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        StringBuilder sb = new StringBuilder();

        while (line != null) {
            sb.append(line).append(System.lineSeparator());
            line = br.readLine();
        }

        String content = sb.toString();
        System.out.println(content);
    }
}
