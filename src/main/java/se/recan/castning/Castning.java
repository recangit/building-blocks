package se.recan.castning;

import se.recan.utils.IOutil;

public class Castning {

    public static void main(String[] args) {
        IOutil.info("Castning");

        System.out.println("Parse int to String: " + Integer.toString(12345));

        int num = -1;
        try {
            num = Integer.parseInt("12345");
        } catch (NumberFormatException nfe) {
            num = 0;
        }
        System.out.println("Parse String to int: " + num);

        System.out.println("Parse boolean to String: " + Boolean.toString(true));

        System.out.println("Parse String to boolean: " + Boolean.parseBoolean("true"));

        Integer n = 5;
        System.out.println("Parse Integer to int: " + (Integer) n.intValue());
    }
}
