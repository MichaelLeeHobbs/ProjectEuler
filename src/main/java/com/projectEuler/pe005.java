package com.projectEuler;

/**
 * Created by michael on 1/31/15.
 */
public class pe005 extends peSolution {

    // set base data and test data
    public pe005() {
        super("PE005", "N/A", "N/A");
    }

    // Smallest multiple
    // 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    // What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

    // Using prime factorization we know
    // 2=2^1
    // 3=3^1
    // 4=2^2
    // 5=5^1
    // 6=2^1*3^1
    // and so on...
    // thus 2^4 * 3^2 * 5 * 7 * 11 * 13 * 17 * 19
    public String solution(String data, String format) {
        startTimer();
        setData(data);

        int result = 2*2*2*2*3*3*5*7*11*13*17*19;

        stopTimer();

        return getResult(format, Integer.toString(result));
    }
}
