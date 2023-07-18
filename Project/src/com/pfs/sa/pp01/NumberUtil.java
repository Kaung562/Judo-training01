package com.pfs.sa.pp01;

import java.util.regex.Pattern;

public class NumberUtil {
    public static boolean isValidNumber(String input) {
        
        String pattern = "^\\d+$";
        return Pattern.matches(pattern, input);
    }

    public static boolean isValidNumber(String input, int length) {
        
        String pattern = "^[0-9]{" + length + "}$";
        return Pattern.matches(pattern, input);
    }

    public static boolean isValidDecimal(String input) {
        
        String pattern = "^\\d*\\.?\\d+$";
        return Pattern.matches(pattern, input);
    }
}
