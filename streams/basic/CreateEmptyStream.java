package streams.basic;

import java.util.stream.Stream;

public class CreateEmptyStream {



    public static void main(String[] args) {

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);

    }
}