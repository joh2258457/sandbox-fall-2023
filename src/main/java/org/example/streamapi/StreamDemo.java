package org.example.streamapi;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

//        Write a random string of chracters
        String randString = Stream.generate(new StringGenerator())
                .limit(30)
                .collect(Collectors.joining());

        System.out.println(randString);
    }
}
