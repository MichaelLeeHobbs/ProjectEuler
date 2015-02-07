package com.projectEuler;

import com.projectEuler.utils.Primes;
import org.junit.runners.model.InitializationError;

import java.util.ArrayList;

/**
 * Created by michael on 2/1/15.
 */
public class pe010 extends peSolution {

    // set base data and test data
    public pe010() {
        super("PE010", "2000000", "10");
    }

    @Override
    public String solution(String data, String format) throws InitializationError {
        startTimer();
        setData(data);

        int n = getArgInt(1);
        long result = 0;

        ArrayList<Integer> primesList = Primes.getArrayOfPrimes(n);

        for (int p : primesList) {
            result += p;
        }

        stopTimer();

        return getResult(format, Long.toString(result));
    }
}
