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

    public static String numberToBritishString(long n) {

        // code breaks when n > 1000
        if (n > 1000) throw new IllegalArgumentException("n must be <= 1000");


        String[] onesPlace = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        // included null to align the array for 1 to 1 mapping
        String[] tensPlace = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String hundred = "hundred";
        String[] place = {"thousand", "million"};
        String and = " and ";
        String space = " ";


        String nString = Long.toString(n);

        // StringBuilder was clunky for this problem and of not much use thus went with basic String
        String[] numberSArray = new String[nString.length()];
        int[] nIntArray = new int[nString.length()];

        // build int array
        for (int i = numberSArray.length - 1; i >= 0; i--) {
            nIntArray[i] = (int) (n % 10);
            n /= 10;
        }


        // phase 1 - convert each number to word
        for (int i = 0; i < nString.length(); i++) {
            numberSArray[i] = onesPlace[nIntArray[i]];
        }

        // phase 2 - convert words into teens where needed
        for (int i = numberSArray.length - 1; i > 0; i -= 3) {
            if (numberSArray[i - 1].equals(onesPlace[1])) {
                numberSArray[i] = teens[nIntArray[i]] + space;
                numberSArray[i - 1] = "";
            }
        }

        // phase 3 - convert tensPlace
        for (int i = numberSArray.length - 2; i >= 0; i -= 3) {
            if (!numberSArray[i].equals("")) {
                numberSArray[i] = tensPlace[nIntArray[i]] + space;
            }
        }

        // phase 4 - convert hundreds places
        for (int i = numberSArray.length - 3; i >= 0; i -= 3) {
            if (!numberSArray[i].equals("")) {
                numberSArray[i] += space + hundred;
            }
        }

        // phase 5 - convert major places
        for (int i = numberSArray.length - 4; i >= 0; i -= 3) {
            if (!numberSArray[i].equals("")) {
                numberSArray[i] += space + place[i];
            }
        }

        // phase 5 - add "and" if we need it
        // an "and" must follow all Y's when the XX > 0  YXXYXX
        for (int i = numberSArray.length - 3; i >= 0; i -= 3) {
            if (!numberSArray[i].equals("")
                    && (!numberSArray[i + 1].equals("") || !numberSArray[i + 2].equals(""))) {
                numberSArray[i] += and;
            }
        }

        StringBuilder result = new StringBuilder();
        for (String s : numberSArray) {
            result.append(s);
        }


        return result.toString();


    }


}
