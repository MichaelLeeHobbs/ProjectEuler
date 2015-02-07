package com.projectEuler.utils;

import java.math.BigInteger;

/**
 * Project: ProjectEuler
 * Created by Michael Hobbs on 2/7/15.
 * email: Michael.Lee.Hobbs@gmail.com
 */
public class MiscMath {
    private static final BigInteger BIG_0 = new BigInteger("0");
    private static final BigInteger BIG_10 = new BigInteger("10");

    public static long digitSum(long n) {
        long sum = 0;
        long value = n;

        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }

    public static BigInteger digitSum(BigInteger n) {
        BigInteger sum = new BigInteger("0");
        BigInteger value = n;

        while (value.compareTo(BIG_0) > 0) {
            sum = sum.add(value.mod(BIG_10));
            value = value.divide(BIG_10);
        }
        return sum;
    }


}
