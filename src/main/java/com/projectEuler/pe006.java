package com.projectEuler;

import org.junit.runners.model.InitializationError;

/**
 * Created by michael on 1/31/15.
 */
public class pe006 extends peSolution {

    // set base data and test data
    public pe006() {
        super("PE006", "100", "10");
    }


    // Sum square difference
    // The sum of the squares of the first ten natural numbers is,
    // 12 + 22 + ... + 102 = 385
    // The square of the sum of the first ten natural numbers is,
    // (1 + 2 + ... + 10)2 = 552 = 3025
    // Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
    // Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

    // there is a sequence thus we can find a closed form 1/12(3n+2)(n^3-3)

    public String solution(String data, String format) throws InitializationError {
        startTimer();
        setData(data);

        int n = getArgInt(1);

        int result = ((3*n+2)*(n*n*n-n))/12;

        stopTimer();

        return getResult(format, Integer.toString(result));
    }
}
