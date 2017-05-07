package org.newtutorials.java.convert.stringtoint;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by dani on 5/7/2017.
 */
public class StringToIntJava8 {
    public static void main(String[] args) {
        convertMultiNumbersStringToIntegerArray();
    }
    public static void convertMultiNumbersStringToIntegerArray(){
        String numbers = "1,2,3,4,5,6";
        String separator = ",";
        Pattern pattern = Pattern.compile(separator);
        List<Integer> numberList = pattern.splitAsStream(numbers)
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        numberList.forEach(number -> System.out.println(number));
    }
}
