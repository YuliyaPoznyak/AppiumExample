package org.example.utils;


public class ParseUtils {
    public static double parseDoubleFromString(String str) {
        double result = 0.0;
        try {
            result = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            System.out.println("Unable to parse double value from string");
        }
        return result;
    }
}
