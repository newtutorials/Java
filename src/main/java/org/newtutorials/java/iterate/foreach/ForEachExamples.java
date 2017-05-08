package org.newtutorials.java.iterate.foreach;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by dani on 5/8/2017.
 */
public class ForEachExamples {
    public static void main(String[] args) throws IOException {

        List<String> theListToIterate = Arrays.asList("We ", "will ", "iterate ","a ","List ", "as ", "Example ");

        theListToIterate.forEach(System.out::print);
        System.out.println();

        Map<Integer, String> mapToIterate = theListToIterate.stream().collect(
                Collectors.toMap(theListToIterate::indexOf,s -> s)
        );

        mapToIterate.forEach((integer, s) -> System.out.print(integer + s));
        System.out.println();

        Arrays.asList(new File(".").listFiles())
                .forEach(file -> System.out.println(file));

    }
}
