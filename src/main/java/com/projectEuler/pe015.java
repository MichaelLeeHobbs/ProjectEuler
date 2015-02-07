package com.projectEuler;

import com.projectEuler.utils.combinatorics;
import org.junit.runners.model.InitializationError;

/**
 * Project: ProjectEuler
 * Created by Michael Hobbs on 2/7/15.
 * email: Michael.Lee.Hobbs@gmail.com
 */
public class pe015 extends peSolution {

    // set base data and test data
    public pe015() {
        super("pe015", "20", "2");
    }

    // solution goes here
    public String solution(String data, String format) throws InitializationError {
        setData(data);
        String result = "";
        startTimer();

        // solution start

        int n = getArgInt(1);
        result = Double.toString(combinatorics.nCr(n * 2, n));

        // solution end
        stopTimer();
        return getResult(format, result);

    }
}
