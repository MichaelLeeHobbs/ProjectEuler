package com.projectEuler.utils;

/**
 * Project: ProjectEuler
 * Created by Michael Hobbs on 2/7/15.
 * email: Michael.Lee.Hobbs@gmail.com
 */
public class Combinatorics {

    /*
     * Formula for Combination: n! / (r! * (n - r)!)
     */
    public static double nCr(double n, double r) {

        // n and r should be integral values
        double rFloor = Math.floor(r);
        double nFloor = Math.floor(n);

        // Check for all invalid values of n and r.
        if ((n < 1) || (r < 0) || (r > n) || (r != rFloor) || (n != nFloor)) {
            throw new IllegalArgumentException("Invalid Input to nCr: n must be greater than r");
        }

        return factorial(n) / (factorial(r) * factorial(n - r));

    }

    public static double factorial(long n) {
        return factorial((int) n);
    }

    public static double factorial(double n) {
        return factorial((int) n);
    }

    public static double factorial(int n) {
        switch (n) {
            case 0:
                return 1l;
            case 1:
                return 1l;
            case 2:
                return 2l;
            case 3:
                return 6l;
            case 4:
                return 24l;
            case 5:
                return 120l;
            case 6:
                return 720l;
            case 7:
                return 5040l;
            case 8:
                return 40320l;
            case 9:
                return 362880l;
            case 10:
                return 3628800l;
            case 11:
                return 39316800l;
            case 12:
                return 479001600l;
            case 13:
                return 6227020800l;
            case 14:
                return 87178291200l;
            case 15:
                return 1307674368000l;
            case 16:
                return 20922789888000l;
            case 17:
                return 355687428096000l;
            case 18:
                return 6402373705728000l;
            case 19:
                return 121645100408832000l;
            case 20:
                return 2432902008176640000l;
            default:
                return factorialHelper(n);
        }

    }

    private static double factorialHelper(double n) {
        return factorial(n - 1) * n;
    }
}
