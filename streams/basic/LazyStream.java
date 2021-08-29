package streams.basic;

import java.util.Arrays;
import java.util.List;

public class LazyStream {



    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        // Lazy. Below statement willn't print anything
        list.stream().filter(n->n%2==0);

        //Prints stream elements as terminal operation is invoked
        list.stream().filter(n->n%2==0).forEach(System.out::println);

    }
}

