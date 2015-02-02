package com.projectEuler;

import org.junit.runners.model.InitializationError;

/**
 * Created by michael on 1/31/15.
 * Tag: modulus
 */
public class pe001 extends peSolution {

    // Multiples of 3 and 5
    // If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    // Find the sum of all the multiples of 3 or 5 below 1000.

    // set base data and test data
    public pe001() {
        super("PE001", "3,5,1000", "3,5,10");
    }

    public String solution(String data, String format) throws InitializationError {
        startTimer();
        setData(data);

        int n = getArgInt(1);
        int m = getArgInt(2);
        int max = getArgInt(3);

        int result = 0;
        for (int i = n; i < max; i += n){
            result += i;
        }

        for (int i = m; i < max; i += m){
            if (i % 3 != 0) {
                result += i;
            }
        }

        stopTimer();

        return getResult(format, Integer.toString(result));
    }
}
