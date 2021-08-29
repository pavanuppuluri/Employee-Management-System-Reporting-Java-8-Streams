package streams.basic;

import java.util.ArrayList;
import java.util.List;

public class CollectionVsStreamIteration{



    public static void main(String[] args) {

        List<String> skillSet = new ArrayList();
        skillSet.add("C");
        skillSet.add("C++");
        skillSet.add("Java");
        skillSet.add("Java");

        // Collection iteration
        for(String skill:skillSet)
            System.out.println(skill);

        // Stream iteration - Printing all elements
        // Here System.out::println is a Lambda function which is of type Consumer Functional Interface
        skillSet.stream().forEach(System.out::println);

        // Stream iteration - Printing distinct elements
        skillSet.stream().distinct().forEach(System.out::println);



    }
}

