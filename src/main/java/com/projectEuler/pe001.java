package com.projectEuler;

/**
 * Created by michael on 1/31/15.
 * Tag: modulus
 */
public class pe001 {

    // Multiples of 3 and 5
    // If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    // Find the sum of all the multiples of 3 or 5 below 1000.
    public static String solution(){
        return solution(3, 5, 1000);
    }

    public static String solution(int n, int m, int max){
        int result = 0;
        for (int i = n; i < max; i += n){
            result += i;
        }

        for (int i = m; i < max; i += m){
            if (i % 3 != 0) {
                result += i;
            }
        }

        return Integer.toString(result);
    }

    public static String test(){
        return solution(3, 5, 10);
    }


}
