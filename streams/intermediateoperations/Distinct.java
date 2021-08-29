package streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;

public class Distinct {

    public static void main(String[] args) {


        // Remove duplicate elements and print
        List<String> skillList = Arrays.asList("C", "C++", "Java", "C", "Python", "Java");

        skillList
                .stream()           // Stream created
                .distinct()         // To remove duplicate elements
                .forEach(System.out::println); // Terminal operation

        // Output C C++ Java Python
    }
}