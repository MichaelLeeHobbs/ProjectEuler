package com.projectEuler.test;

import com.projectEuler.utils.Primes;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class primesTest {

    @Test
    public void testGetArrayOfPrimes() throws Exception {
        ArrayList<Integer> primeArray = Primes.getArrayOfPrimes(10000000);

        for (int p : primeArray) {
            assertTrue("Tested primes.getArrayOfPrimes and found " + p + " which is not prime.", Primes.isPrime(p));
        }

    }
}