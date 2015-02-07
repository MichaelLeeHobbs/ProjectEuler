package com.projectEuler;

import com.projectEuler.utils.Primes;
import org.junit.runners.model.InitializationError;

import java.util.List;

/**
 * Created by michael on 1/31/15.
 */
public class pe003 extends peSolution {

    // Largest prime factor
    // The prime factors of 13195 are 5, 7, 13 and 29.
    // What is the largest prime factor of the number 600851475143?
    // set base data and test data
    public pe003() {
        super("PE003", "600851475143", "13195");
    }

    public String solution(String data, String format) throws InitializationError {
        startTimer();
        setData(data);

        long n = getArgLong(1);

        List<Integer> factors = Primes.factor(n);
        long result = factors.get(factors.size() - 1);

        stopTimer();

        return getResult(format, Long.toString(result));
    }
}
