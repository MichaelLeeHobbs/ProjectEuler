package com.projectEuler;

import com.projectEuler.utils.primes;
import org.junit.runners.model.InitializationError;

import java.util.ArrayList;

/**
 * Project: ProjectEuler
 * Created by Michael Hobbs on 2/2/15.
 * email: Michael.Lee.Hobbs@gmail.com
 */
public class pe012 extends peSolution {

    // set base data and test data
    public pe012() {
        super("pe012", "500,100", "5,2");
    }

    // solution goes here
    public String solution(String data, String format) throws InitializationError {
        setData(data);
        String result = "";
        startTimer();

        // solution start

        int nArg = getArgInt(1);
        int minDivisor = getArgInt(2);
        ArrayList<Integer> primeArray = primes.getArrayOfPrimes();

        int triangleNum = 0;
        int factors = 0;
        for (int i = 1; factors <= nArg; i++) {
            triangleNum += i;
            if (triangleNum % minDivisor != 0) continue;
            factors = 1;
            for (int d = 1; d < Math.sqrt(triangleNum) && factors <= nArg; d++) {
                int test = triangleNum % d;
                if (test == 0)
                    factors += 2;
            }
        }

        result = Integer.toString(triangleNum);


        // solution end
        stopTimer();
        return getResult(format, result);

    }
}
