package com.projectEuler;

import com.projectEuler.utils.primes;

/**
 * Created by michael on 1/31/15.
 */
public class pe007 {

    public static String solution(int n){
        return Integer.toString(primes.getNthPrime(n));
    }

    public static String solution(){
        return solution(10001);
    }

    public static String test(){
        return solution(6);
    }
}
