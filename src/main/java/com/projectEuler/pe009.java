package com.projectEuler;

/**
 * Created by michael on 2/1/15.
 */
public class pe009 {

    /*
    Special Pythagorean triplet
    Problem 9
    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

    a2 + b2 = c2
    For example, 32 + 42 = 9 + 16 = 25 = 52.

    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.
     */


    public static String test() {
        return solution(12);
    }

    public static String solution() {
        return solution(1000);
    }

    public static String solution(int target) {
        int a = 0;
        int b = 0;
        int c = 0;
        int result = 0;

        for (c = 3; result != target; c++) {

            for (b = 2; b < c; b++) {
                for (a = 1; a < b; a++) {
                    if (a * a + b * b == c * c) {
                        result = a + b + c;
                        if (result == target)
                            break;
                    }
                }
                if (result == target)
                    break;
            }
            if (result == target)
                break;
        }

        return Integer.toString(a * b * c);
    }
}
