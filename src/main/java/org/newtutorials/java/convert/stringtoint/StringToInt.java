package org.newtutorials.java.convert.stringtoint;

/**
 * Created by dani on 5/7/2017.
 */
public class StringToInt {

    public static void main(String[] args) {

        String stringNumber = "123";
        int primitive = Integer.parseInt(stringNumber);
        System.out.println("int = " + primitive);

        Integer integer = Integer.valueOf(stringNumber);
        System.out.println("Integer = " + integer);

        primitive = integer;
        integer = primitive;

        // let try to get an exception
        String notNumber ="123NA";

        try {
            integer = Integer.parseInt(notNumber);
        } catch (NumberFormatException nfe){
            nfe.printStackTrace();
        }
    }
}
