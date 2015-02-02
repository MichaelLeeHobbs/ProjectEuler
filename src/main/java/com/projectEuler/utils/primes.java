package com.projectEuler.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by michael on 1/31/15.
 */
public class primes {

    private static int maxPrime = 10000000;
    private static boolean[] primes = new boolean[maxPrime + 1];
    static {
        Arrays.fill(primes, Boolean.TRUE);
        primes[0] = false;
        primes[1] = false;

        int stop = (int) Math.sqrt(primes.length);
        for (int i = 2; i < stop; i++){
            if (primes[i]){
                for (int k = i * i; k < primes.length && k > 0; k += i){
                    primes[k] = false;
                }
            }
        }
    }


    public static List factor(long n){
        List<Integer> primeFactors = new ArrayList<Integer>();

        long num = n;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                if (n % i == 0) {
                    primeFactors.add(i);
                    num /= i;
                    if (num == 1) {
                        break;
                    }
                }
            }
        }

        if (num > 1){
            return null;
        }
        return primeFactors;
    }

    public static int getNthPrime(int n){
        int count = 0;

        for (int i = 0; i < primes.length; i++){
            if (primes[i]) {
                count++;
            }

            if (count == n) {
                return i;
            }
        }

        return 0;
    }

    public static ArrayList<Integer> getArrayOfPrimes() {
        return getArrayOfPrimes(maxPrime);
    }

    public static ArrayList<Integer> getArrayOfPrimes(int primesLessThanN) {
        ArrayList<Integer> primeArray = new ArrayList<Integer>();

        for (int i = 0; i < primes.length && i < primesLessThanN; i++) {
            if (primes[i]) {
                primeArray.add(i);
            }
        }
        return primeArray;
    }

    public static boolean isPrime(int num) {
        if (num % 2 == 0 && num != 2) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
}
