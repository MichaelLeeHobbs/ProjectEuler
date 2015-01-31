package com.projectEuler;

/**
 * Created by michael on 1/31/15.
 */
public class pe004 {

    // Largest palindrome product
    // A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    // Find the largest palindrome made from the product of two 3-digit numbers.
    public static String solution(){
        int result = 0;
        for (int m = 999, n = 999; ; n--){
            result = m * n;
            if (com.projectEuler.utils.strings.isPalindrome(Integer.toString(result))){
                return Integer.toString(result);
            }

            if (n < 900) {
                n = 998;
                m--;
            }
        }
    }
}
