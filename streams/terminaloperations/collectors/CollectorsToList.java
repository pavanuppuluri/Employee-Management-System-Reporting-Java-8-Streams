package streams.terminaloperations.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsToList {
        public static void main(String[] args) {


                // Code to collect even numbers from a stream of numbers

                List<Integer> allNumbers = Arrays.asList(1, 2, 3, 4, 5, 6);

                List<Integer> evenNumbers = allNumbers
                        .stream()
                        .filter(i -> i % 2 == 0)
                        .collect(Collectors.toList());

                System.out.println(evenNumbers);

                // Output 2 4 6
        }
}