package streams.terminaloperations.match;

import java.util.Arrays;
import java.util.List;
import streams.employee.Employee;

public class AnyMatch {



    public static void main(String[] args) {

        Employee employee1 = new Employee(1000, "Bhavani", 1000, "Technology", "R&D");
        Employee employee2 = new Employee(1001, "Sruthi", 2000, "Technology", "Cyber Security");
        Employee employee3 = new Employee(1002, "Lasya", 3000, "Technology", "Project Development");


        List<Employee> employeeList = Arrays.asList(
                employee1,
                employee2,
                employee3);

        // Check if any employee has salary <1000 or not
        // anyMatch() returns true if any of the stream
        // element satisfies the given condition

        boolean anyEmpSalGteThousand = employeeList
                                        .stream()
                                         .anyMatch(e->e.getSalary()<1000);
        System.out.println(anyEmpSalGteThousand);

        // Output false

        // Check if any employee has salary >=2000 or not
        // anyMatch() returns true if any of the stream
        // element satisfies the given condition

        boolean anyEmpSalGte2Thousand = employeeList
                                         .stream()
                                          .anyMatch(e->e.getSalary()>=2000);
        System.out.println(anyEmpSalGte2Thousand);

        // Output true

















    }
}

