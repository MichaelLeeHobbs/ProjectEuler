package com.projectEuler;

import org.junit.runners.model.InitializationError;

/**
 * Created by michael on 2/1/15.
 */
public class pe009 extends peSolution {

    /*
    Special Pythagorean triplet
    Problem 9
    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

    a2 + b2 = c2
    For example, 32 + 42 = 9 + 16 = 25 = 52.

    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.
     */

    // set base data and test data
    public pe009() {
        super("PE009", "1000", "12");
    }

    public String solution(String data, String format) throws InitializationError {
        startTimer();
        setData(data);

        int a = 0;
        int b = 0;
        int c = 0;
        int result = 0;
        int target = getArgInt(1);

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

        result = a * b * c;
        stopTimer();

        return getResult(format, Integer.toString(result));
    }
}
