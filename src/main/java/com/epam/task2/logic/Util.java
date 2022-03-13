package com.epam.task2.logic;

import java.util.Scanner;

public class Util {

    public static String input(Scanner scanner) throws MyException {
        String s = null;
        if (scanner.hasNextLine()) {
            s = scanner.nextLine();
        }

        if (s.equals("")) {
            throw new MyException("String can not be empty!");
        }
        return s;
    }
}
