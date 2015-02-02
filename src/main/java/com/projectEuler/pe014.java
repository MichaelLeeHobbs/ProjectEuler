package com.projectEuler;

import org.junit.runners.model.InitializationError;

import java.util.HashMap;
import java.util.Map;

/**
 * Project: ProjectEuler
 * Created by Michael Hobbs on 2/2/15.
 * email: Michael.Lee.Hobbs@gmail.com
 */
public class pe014 extends peSolution {

    // set base data and test data
    public pe014() {
        super("pe014", "1000000", "14");
    }

    // solution goes here
    public String solution(String data, String format) throws InitializationError {
        setData(data);
        String result = "";
        startTimer();

        // solution start
        Map<Long, Long> integerMap = new HashMap<Long, Long>(1000000);
        integerMap.put(1l, 1l);

        int argInt = getArgInt(1);

        for (int i = 2; i < argInt; i++) {
            long candidate = i;
            int count = 0;

            while (true) {
                if (integerMap.containsKey(candidate)) {
                    integerMap.put((long) i, integerMap.get(candidate) + count);
                    break;
                }

                if (candidate % 2l == 0l) candidate /= 2l;
                else candidate = candidate * 3l + 1l;
                count++;
            }
        }

        int key = 0;
        long value = 0;
        for (int i = 1; i < argInt; i++) {
            if (integerMap.get((long) i) > value) {
                key = i;
                value = integerMap.get((long) i);
            }
        }

        result = "key: " + key + "  value: " + value;

        // solution end
        stopTimer();
        return getResult(format, result);

    }
}
