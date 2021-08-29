package streams.employee;

public class Employee {

    int employeeID;
    String name;
    int salary;
    String department;
    String division;

    public Employee(int employeeID, String name, int salary, String department, String division) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
