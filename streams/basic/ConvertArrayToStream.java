package streams.basic;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertArrayToStream {


    public static void main(String[] args) {


        String[] skills = {"C", "C++", "Java"};

        // Using Stream.of
        Stream<String> skillsStream1 = Stream.of(skills);
        skillsStream1.forEach(System.out::println);

        // Using Array.stream
        Stream<String> skillsStream2 = Arrays.stream(skills);
        skillsStream2.forEach(System.out::println);


    }


}




