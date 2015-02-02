package com.projectEuler;

import com.projectEuler.utils.primes;
import org.junit.runners.model.InitializationError;

/**
 * Created by michael on 1/31/15.
 */
public class pe007 extends peSolution {

    // set base data and test data
    public pe007() {
        super("PE007", "10001", "6");
    }


    public String solution(String data, String format) throws InitializationError {
        startTimer();
        setData(data);

        int n = getArgInt(1);
        int result = primes.getNthPrime(n);

        stopTimer();

        return getResult(format, Integer.toString(result));
    }
}
