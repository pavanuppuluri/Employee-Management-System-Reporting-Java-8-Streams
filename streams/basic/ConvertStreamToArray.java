package streams.basic;

import java.util.stream.Stream;


public class ConvertStreamToArray {


    public static void main(String[] args) {


        String[] skillsArray = Stream.of("C", "C++", "Java").toArray(String[]::new);
        for(String skill:skillsArray)
        {
            System.out.println(skill);
        }

        int[] array = Stream.of(1, 2, 3).mapToInt(i -> i).toArray();
        for(int num:array)
        {
            System.out.println(num);
        }


    }


}




