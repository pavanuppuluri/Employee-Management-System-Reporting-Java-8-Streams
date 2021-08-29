package streams.terminaloperations.groupby;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import streams.employee.Employee;




public class MultiLevelGroupBy {



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

        // First group by Department and then by Division within each Department

        Map<String, Map<String,List<Employee>>> empByDept = employeeList
                .stream()
                .collect(
                        Collectors.groupingBy(Employee::getDepartment,
                                Collectors.groupingBy(Employee::getDivision))
                );

        empByDept.forEach((k,v)->{
          v.forEach((k1,v1)->{
              System.out.println("Department "+k+" Division "+k1+ " "+v1.stream().map(e->e.getName()).collect(Collectors.joining(",")));
          });
            System.out.println();
        });



    }


}

//        Output
//        Department Technology Division R&D Bhavani,Srinivas
//        Department Technology Division Cyber Security Sruthi
//        Department Technology Division Project Development Lasya
//
//        Department Finance Division Audit Mani,Phani
//        Department Finance Division Cost Accounts Pavan
//        Department Finance Division Accounting Ramu
//
//        Department Marketing Division Sales Siva



