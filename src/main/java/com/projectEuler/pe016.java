package com.projectEuler;

import com.projectEuler.utils.MiscMath;
import org.junit.runners.model.InitializationError;

import java.math.BigInteger;

/**
 * Project: ProjectEuler
 * Created by Michael Hobbs on 2/7/15.
 * email: Michael.Lee.Hobbs@gmail.com
 */
public class pe016 extends peSolution {

    // set base data and test data
    public pe016() {
        super("pe016", "2,1000", "2,15");
    }

    // solution goes here
    public String solution(String data, String format) throws InitializationError {
        setData(data);
        String result = "";
        startTimer();

        // solution start

        int n = getArgInt(1);
        int m = getArgInt(2);

        BigInteger value = new BigInteger(Integer.toString(n));
        value = value.pow(m);

        result = MiscMath.digitSum(value).toString();


        // solution end
        stopTimer();
        return getResult(format, result);

    }
}
