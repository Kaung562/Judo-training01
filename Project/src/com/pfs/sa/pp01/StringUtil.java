package com.pfs.sa.pp01;

import java.util.regex.Pattern;

public class StringUtil {
    // Reference :
    // https://learn.microsoft.com/en-us/dotnet/standard/base-types/regular-expression-language-quick-reference

    public static boolean isAlpha(String input) {
        
        String pattern = "^[a-zA-Z]+$";
        return Pattern.matches(pattern, input);
    }

    public static boolean isAlphaWithSpace(String input) {
       
        String pattern = "^[a-zA-Z ]+$";
        return Pattern.matches(pattern, input);
    }

    public static boolean isEmpty(String input) {
        return input == null ? true : input.equals("");
    }
}