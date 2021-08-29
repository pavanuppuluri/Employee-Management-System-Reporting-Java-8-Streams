package streams.terminaloperations.groupby;

import streams.employee.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;



public class CollectorsGroupingBy {



    public static void main(String[] args) {



        Employee employee1 = new Employee(1000, "Bhavani", 1000, "Technology", "R&D");
        Employee employee2 = new Employee(1001, "Sruthi", 2000, "Technology", "Cyber Security");
        Employee employee3 = new Employee(1002, "Lasya", 3000, "Technology", "Project Development");
        Employee employee4 = new Employee(1003, "Srinivas", 3000, "Technology", "R&D");
        Employee employee5 = new Employee(1004, "Ramu", 2000, "Finance", "Accounting");
        Employee employee6 = new Employee(1005, "Mani", 2500, "Finance", "Audit");
        Employee employee7 = new Employee(1006, "Pavan", 1500, "Finance", "Cost Accounts");
        Employee employee8 = new Employee(1007, "Phani", 2500, "Finance", "Audit");
        Employee employee9 = new Employee(1009, "Siva", 2500, "Marketing", "Sales");

        List<Employee> employeeList = Arrays.asList(
                employee1,
                employee2,
                employee3,
                employee4,
                employee5,
                employee6,
                employee7,
                employee8,
                employee9);

        Map<String, List<Employee>> empByDept = employeeList
                .stream()
                .collect(
                        Collectors.groupingBy(Employee::getDepartment)
                );

        empByDept.forEach((k, v) ->
                System.out.println("Department : " + k + " Employees : " +
                        ((List<Employee>) v).stream()
                                .map(e -> e.getName())
                                .collect(Collectors.joining(","))));

        // Output
//        Department : Technology Employees : Bhavani,Sruthi,Lasya,Srinivas
//        Department : Finance Employees : Ramu,Mani,Pavan,Phani
//        Department : Marketing Employees : Siva

        Map<String, Long> empCountByDept = employeeList
                .stream()
                .collect(
                        Collectors.groupingBy(Employee::getDepartment,Collectors.counting())
                );

        empCountByDept.forEach((k, v) ->
                System.out.println("Department : " + k + " No. of Employees : "+v));

        // Output
//        Department : Technology No. of Employees : 4
//        Department : Finance No. of Employees : 4
//        Department : Marketing No. of Employees : 1

        Map<String, List<String>> namesByDept=
        employeeList
                .stream()
                .collect(
                        Collectors.groupingBy(Employee::getDepartment,
                                Collectors.mapping(Employee::getName, toList())));

        System.out.println(namesByDept);

        // Output
        //{Technology=[Bhavani, Sruthi, Lasya, Srinivas],
        // Finance=[Ramu, Mani, Pavan, Phani],
        // Marketing=[Siva]}



    }


}

