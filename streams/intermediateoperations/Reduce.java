package streams.intermediateoperations;

import streams.employee.Employee;
import java.util.Arrays;
import java.util.List;


public class Reduce {


    public static void main(String[] args) {

//        // Count sum of all elements using streams.terminaloperations.collectors.streams.terminaloperations.collectors.streams.terminaloperations.collectors.streams
//
//        List<Integer> ages = Arrays.asList(1,2,3,4,5,6);
//
//        // We are passing accumulator function to reduce()
//        // to perform sum of the stream elements
//        Optional<Integer> totalSum = ages.stream()
//                                    .reduce(
//                                            (a,b)->a+b //accumulator
//                                           );
//
//        System.out.println(totalSum.get());
//
//        // Output 21

        // Count sum of all elements using streams.terminaloperations.collectors.streams.terminaloperations.collectors.streams.terminaloperations.collectors.streams

        // Program to greet list of people with Hi
        // Below reduce function starts with default
        // value "Hi " and then concatenates all stream
        // elements to it
//        List<String> names = Arrays.asList("Ram","Sam","Gopi");
//
//        String totalSum = names.stream()
//                .reduce(
//                        "Hi ",         // identity
//                        (a,b)->a+b+" " //accumulator
//                );
//
//        System.out.println(totalSum);

        // Output Hi Ram Sam Gopi


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

        // Calculate total salary

        int result = employeeList
                .stream()
                .reduce(
                        0,  //identity
                        (salary, e) -> salary + e.getSalary(), // accumulator
                        Integer::sum
                );

        System.out.println(result);

//        // Count sum of stream elements using parallel streams.terminaloperations.collectors.streams.terminaloperations.collectors.streams.terminaloperations.collectors.streams
//
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
//
//        // We are passing identity, accumulator, combiner
//        int sum = numbers.parallelStream()
//                                 .reduce(
//                                        0,           // identity
//                                        (a,b)->a+b,  // accumulator
//                                        Integer::sum // combiner
//                                        );
//        System.out.println(sum);
//
//        // Output 45


    }


}

