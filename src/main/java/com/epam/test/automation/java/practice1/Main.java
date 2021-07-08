package com.epam.test.automation.java.practice1;

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
        int array[] = new int[3];
        String number = String.valueOf(n);
        for (int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            for (int a = 0; a < array.length; i++) {
                array[a] = array[j];
            }
        }
        int a = array[0];
        int b = array[1];
        int c = array[2];
        int result = 0;


        if (a > b && a > c && b > c) {
            result = Integer.parseInt(a + "" + b + "" + c);
        } else {
            if (a >= b && a >= c && b <= c) {
                result = Integer.parseInt(a + "" + c + "" + b);
            } else {
                if (a <= b && a >= c && b >= c) {
                    result = Integer.parseInt(b + "" + a + "" + c);
                } else {
                }
                if (a <= b && a <= c && b >= c) {
                    result = Integer.parseInt(b + "" + c + "" + a);
                } else {
                    if (a >= b && a <= c && b <= c) {
                        result = Integer.parseInt(c + "" + a + "" + b);
                    } else {
                        if (a <= b && a <= c && b <= c) {
                            result = Integer.parseInt(c + "" + b + "" + a);
                        } else {
                        }
                    }
                }
            }
        }
        return result;
    }
}
