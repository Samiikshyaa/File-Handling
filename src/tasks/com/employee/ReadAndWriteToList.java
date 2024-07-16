package tasks.com.employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadAndWriteToList {
    public static void main(String[] args) {
        File file = new File("D://employee.txt");
        List<Employee> emplist = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                String [] employeeData = line.split(",");
//                System.out.println(employeeData);
                System.out.println(employeeData[0]);
                System.out.println(employeeData[1]);
                System.out.println(employeeData[2]);
                System.out.println(employeeData[3]);

                Employee employee = new Employee(Integer.parseInt(employeeData[0]),employeeData[1],employeeData[2],Boolean.parseBoolean(employeeData[3]));
                emplist.add(employee);
                System.out.println("--------------------------------------------");
            }
            System.out.println("The size of the employee is: "+ emplist.size());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
