package streams.terminaloperations.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorsToCollection
{
        public static void main(String[] args) {


                // We are using TreeSet to collect unique skills and to order
                // them in alphabetical order

                List<String> skills = Arrays.asList("C++", "Java", "C", "AWS");

                TreeSet<String> uniqueSkills = skills
                        .stream()
                        .collect(Collectors.toCollection(TreeSet::new));

                System.out.println(uniqueSkills);

                //Output AWS, C, C++, Java
        }
}