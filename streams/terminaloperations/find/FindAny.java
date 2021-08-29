package streams.terminaloperations.find;

import java.util.Optional;
import java.util.stream.Stream;

public class FindAny {


    public static void main(String[] args) {


        // Find any element of a given stream


        // Creating stream. By default it will be a sequential stream
        Stream<String> namesSequentialStream = Stream.of("Anand", "Sruthi", "Uma");
        Optional<String> anyNameFromSequentialStream = namesSequentialStream.findAny();
        anyNameFromSequentialStream.ifPresent(System.out::println);
        // Output Anand

        // Creating a parallel stream
        Stream<String> namesParallelStream = Stream.of("Anand", "Sruthi", "Uma","Sai","Ram","Lasya").parallel();
        Optional<String> anyNameFromParallelStream = namesParallelStream.parallel().findAny();
        anyNameFromParallelStream.ifPresent(System.out::println);
        // Output Sai. Here Output may vary



    }
}

