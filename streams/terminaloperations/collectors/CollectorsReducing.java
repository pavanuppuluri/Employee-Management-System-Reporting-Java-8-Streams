package streams.terminaloperations.collectors;


import streams.employee.Employee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;




public class CollectorsReducing {



    public static void main(String[] args) {


        Employee employee1 = new Employee(1000, "Bhavani", 1000, "Technology", "R&D");
        Employee employee2 = new Employee(1001, "Sruthi", 2000, "Technology", "Cyber Security");
        Employee employee3 = new Employee(1002, "Lasya", 9000, "Technology", "Project Development");
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

        Comparator<streams.employee.Employee> bySalary = Comparator.comparing(streams.employee.Employee::getSalary);

        // Get highest paid Employee across Departments
        Optional<streams.employee.Employee> highestPaidEmp = employeeList.stream()
                .collect(Collectors
                        .reducing(BinaryOperator
                                .maxBy(bySalary)));

        System.out.print("Highest Paid Employee ");

        highestPaidEmp.ifPresent(e->
        {
            System.out.print(e.getName()+
                                " In Department " +e.getDepartment()+
                                    " Salary "+e.getSalary());}
        );
        System.out.println();

       // Get Highest Paid Salary By Department
        Map<String, Optional<streams.employee.Employee>> highestSalaryByDept
                =
                employeeList
                        .stream()
                        .collect(
                                Collectors.groupingBy(
                                        streams.employee.Employee::getDepartment,
                                        Collectors.reducing(BinaryOperator.maxBy(bySalary))));

        System.out.println("Highest Paid Employee By Department ");

        highestSalaryByDept.forEach((k,v)-> System.out.println(k+" "+v.get().getName()+" "+v.get().getSalary()));

        System.out.println("Salary To Be Paid Department wise ");
        BinaryOperator<Integer> sumFunction = (a,b)->a+b;

        Map<String, Integer> totalSalaryByDept
                =
                employeeList
                        .stream()
                        .collect(
                                Collectors.groupingBy(
                                        streams.employee.Employee::getDepartment,
                                        Collectors.reducing(0,streams.employee.Employee::getSalary,sumFunction)));

        totalSalaryByDept.forEach((k,v)-> System.out.println(k+" "+v));

//        BinaryOperator<Double> sumFunction = (a,b)->a+b;
//
//        double totalSalary
//                =
//                employeeList
//                        .stream()
//                        .map(e->e.getSalary())
//                        .collect(
//                                Collectors.reducing(0.0,(a,b)->a+b)
//                        );
//
//        System.out.println(totalSalary);















    }


}

