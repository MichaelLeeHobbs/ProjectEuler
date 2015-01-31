package com.projectEuler;

import com.projectEuler.utils.primes;

import java.util.List;

/**
 * Created by michael on 1/31/15.
 */
public class pe003 {

    // Largest prime factor
    // The prime factors of 13195 are 5, 7, 13 and 29.
    // What is the largest prime factor of the number 600851475143?
    public static String solution(){
        return solution(600851475143l);
    }

    public static String solution(long n){
        List<Integer> factors = primes.factor(n);
        return Integer.toString(factors.get(factors.size()-1));
    }

    public static String test(){
        return solution(13195l);
    }
}
