package streams.terminaloperations.find;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class FindFirst {


    public static void main(String[] args) {


        // Find any element of a given stream


        // Creating stream. By default it will be a sequential stream
        Stream<String> namesSequentialStream = Stream.of("Anand", "Sruthi", "Uma");
        Optional<String> anyNameFromSequentialStream = namesSequentialStream.findFirst();
        anyNameFromSequentialStream.ifPresent(System.out::println);
        // Output Anand

        // Creating a parallel stream
        Stream<String> namesParallelStream = Stream.of("Anand", "Sruthi", "Uma","Sai","Ram","Lasya").parallel();
        Optional<String> anyNameFromParallelStream = namesParallelStream.parallel().findFirst();
        anyNameFromParallelStream.ifPresent(System.out::println);
        // Output Anand

        // Find first even number from random streams of integers

        Random random = new Random();
        System.out.println(
                random.ints()
                        .filter(i->i%2==0) //Check if number is even
                        .findFirst()); // Get the first even number

        // Output 182746608



    }
}

