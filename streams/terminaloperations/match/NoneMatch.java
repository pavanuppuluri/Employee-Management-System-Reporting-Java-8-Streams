package streams.terminaloperations.match;

import streams.employee.Employee;

import java.util.Arrays;
import java.util.List;


public class NoneMatch {


    public static void main(String[] args) {

        Employee employee1 = new Employee(1000, "Pavan", 1000, "Technology", "IT");
        Employee employee2 = new Employee(1001, "Sruthi", 2000, "Administration", "Risks & Controls");
        Employee employee3 = new Employee(1002, "Lasya", 3000, "HR", "Recruiting");

        List<Employee> employeeList = Arrays.asList(
                employee1,
                employee2,
                employee3);

        // Check if all employees have salary <10000 or not
        // noneMatch() returns true if none of the
        // stream element satisfies the given condition

        boolean allEmpSalLT10K = employeeList
                                        .stream()
                                         .noneMatch(e->e.getSalary()>=10000);
        System.out.println(allEmpSalLT10K);

        // Output true

        // Check if all employees have salary >=1000
        boolean allEmpSalGTE1K = employeeList
                .stream()
                .noneMatch(e->e.getSalary()<1000);
        System.out.println(allEmpSalGTE1K);

        // Check if all employees have salary >=2000
        boolean allEmpSalGTE2K = employeeList
                .stream()
                .noneMatch(e->e.getSalary()<2000);
        System.out.println(allEmpSalGTE2K);




    }
}

