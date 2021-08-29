package streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {


    public static void main(String[] args) {


        List<String> topicsOfSpeaker1 = Arrays.asList("C","C++","Java");
        List<String> topicsOfSpeaker2 = Arrays.asList("C","Spring","Spring Boot","Micro Services","Oracle");
        List<String> topicsOfSpeaker3 = Arrays.asList("Oracle","MongoDB","DynamoDB");

        List<List<String>> totalTopics = Arrays.asList(topicsOfSpeaker1,topicsOfSpeaker2,topicsOfSpeaker3);

        List topics = totalTopics.stream()
                .map(s->s.stream())
                .collect(Collectors.toList());

        System.out.println(topics);

        // Output
        // [java.util.stream.ReferencePipeline$Head@8db2f2,
        // java.util.stream.ReferencePipeline$Head@18bf509,
        // java.util.stream.ReferencePipeline$Head@1d0d5ae]

        // Our intention is to print the topic names, but above code prints
        // List object value instead of topic names
        // To extract topic names we need to use flatMap instead of map

        topics = totalTopics.stream()
                .flatMap(s->s.stream())
                .collect(Collectors.toList());

        System.out.println(topics);

        // Output
        // [C, C++, Java, C, Spring, Spring Boot, Micro Services, Oracle, Oracle, MongoDB, DynamoDB]



















    }
}

