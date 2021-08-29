package streams.terminaloperations.match;

import java.util.Arrays;
import java.util.List;
import streams.employee.Employee;


public class AllMatch {


    public static void main(String[] args) {

        Employee employee1 = new Employee(1000, "Pavan", 1000, "Technology", "IT");
        Employee employee2 = new Employee(1001, "Sruthi", 2000, "Administration", "Risks & Controls");
        Employee employee3 = new Employee(1002, "Lasya", 3000, "HR", "Recruiting");

        List<Employee> employeeList = Arrays.asList(
                employee1,
                employee2,
                employee3);

        // Check if all employees have salary >=1000 or not
        // anyMatch() returns true if all the stream
        // elements satisfies the given condition

        boolean allEmpSalGteThousand = employeeList
                                        .stream()
                                         .allMatch(e->e.getSalary()>=1000);
        System.out.println(allEmpSalGteThousand);

        // Output true

        // Check if all employees have salary >=2000 or not
        // anyMatch() returns true if all the stream
        // elements satisfies the given condition

        boolean allEmpSalGte2Thousand = employeeList
                .stream()
                .allMatch(e -> e.getSalary() >= 2000);
        System.out.println(allEmpSalGte2Thousand);

        // Output false


    }
}

