package com.epam.task2.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPattern {

    public static boolean CompareName(String name) {

        boolean temp = false;
        Pattern pattern = Pattern.compile("^[A-Za-z]\\w{1,29}$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            temp = true;
        }
        return temp;

    }

    public static boolean CompareAge(String age) {
        boolean temp = false;
        Pattern pattern = Pattern.compile("^(1[89]|[2-9][0-9])$");
        Matcher matcher = pattern.matcher(age);
        if (matcher.matches()) {
            temp = true;
        }
        return temp;
    }

    public static boolean ComparePhone(String phoneNumber) {
        boolean temp = false;
        Pattern pattern = Pattern.compile("^\\d{9}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            temp = true;
        }
        return temp;
    }


}
