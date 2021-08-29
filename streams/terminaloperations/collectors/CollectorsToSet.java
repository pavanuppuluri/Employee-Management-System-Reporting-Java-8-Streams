package streams.terminaloperations.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsToSet {

        public static void main(String[] args) {


                // Collect all unique skills from a given skillset stream

                List<String> skills = Arrays.asList("C", "C++", "Java", "C");

                Set<String> uniqueSkills = skills
                        .stream()
                        .collect(Collectors.toSet());

                System.out.println(uniqueSkills);

                // Output C C++ Java
        }
}