package com.epam.test.automation.java.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int n) {
        if (n > 0) {
            n = n * n;
        } else if (n < 0) {
            n = Math.abs(n);
        } else {
            n = 0;
        }
        return n;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int n) {
        List<String> putInString = Arrays.asList(String.valueOf(n).split(""));
        putInString.sort(Comparator.reverseOrder());

        StringBuilder stringBuilder = new StringBuilder();
        putInString.forEach(stringBuilder::append);
        return Integer.parseInt(stringBuilder.toString());
    }
}
