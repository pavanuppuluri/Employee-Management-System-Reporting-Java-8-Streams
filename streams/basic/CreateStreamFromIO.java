package streams.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class CreateStreamFromIO {
    public static void main(String[] args) throws MalformedURLException {

        String urlString = "https://raw.githubusercontent.com/pavanuppuluri/Java-8-Streams/master/Data.txt";
        URL url = new URL(urlString);
        // To print lines in a file
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8))) {

            //lines() method returns a stream
            reader.lines().forEach(System.out::println);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {

        }
    }
}