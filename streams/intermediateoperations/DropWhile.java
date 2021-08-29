package streams.intermediateoperations;

import java.util.stream.Stream;

public class DropWhile
{
    public static void main(String[] args) {


                        // Introduced In Java 9
                        // Ordered input stream
                        Stream<Integer> numbersStream=Stream.of(1,2,3,4,5,6,7,8,9);
                       // numbersStream.dropWhile(i->i<5).forEach(System.out::println);

                        // Output 5 6 7 8 9
    }
}
