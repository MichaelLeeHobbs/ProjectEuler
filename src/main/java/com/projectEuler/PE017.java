package com.projectEuler;

import com.projectEuler.utils.MiscMath;
import org.junit.runners.model.InitializationError;

/**
 * Project: ProjectEuler
 * Created by Michael Hobbs on 2/7/15.
 * email: Michael.Lee.Hobbs@gmail.com
 */
public class PE017 extends peSolution {

    // set base data and test data
    public PE017() {
        super("PE017", "1,1000", "1,5");
    }

    // solution goes here
    public String solution(String data, String format) throws InitializationError {
        setData(data);
        String result = "";
        startTimer();

        // solution start

        int n = getArgInt(1);
        int m = getArgInt(2);

        int sum = 0;
        for (int i = n; i <= m; i++) {
            String numToWord = MiscMath.numberToBritishString(i);
            System.out.println(numToWord);
            sum += MiscMath.numberToBritishString(i).toString().replaceAll(" ", "").length();
        }


        result = Integer.toString(sum);

        // solution end
        stopTimer();
        return getResult(format, result);

    }
}
