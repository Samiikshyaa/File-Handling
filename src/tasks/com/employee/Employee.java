package tasks.com.employee;

public class Employee {
    private int Emp_id;
    private String Emp_name;

    public Employee(int emp_id, String emp_name, String department, boolean status) {
        Emp_id = emp_id;
        Emp_name = emp_name;
        this.department = department;
        this.status = status;
    }

    private String department;
    private boolean status;

    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }

    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_name(String emp_name) {
        Emp_name = emp_name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
