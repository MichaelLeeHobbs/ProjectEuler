package com.projectEuler.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by michael on 1/31/15.
 * Class will record results of previous calls to getNthTerm to speed up future calls
 * This is result in greater memory usage but significantly faster run time
 * Tag: recursion, memoization
 */
public class Fibonacci {
    private static Map fibSequence = new HashMap();
    static {
        fibSequence.put(1, 1);
        fibSequence.put(2, 2);
    }

    public static int getNthTerm(int n){
        if (fibSequence.containsKey(n)){
            return ((Integer) fibSequence.get(n));
        } else {
            fibSequence.put(n, getNthTerm(n - 1) + getNthTerm(n - 2));
            return ((Integer) fibSequence.get(n));
        }
    }

}
