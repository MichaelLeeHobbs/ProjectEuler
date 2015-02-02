package com.projectEuler;

/**
 * Created by michael on 1/31/15.
 */
public class pe004 extends peSolution {

    protected pe004() {
        super("PE004", "N/A", "N/A");
    }

    // Largest palindrome product
    // A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    // Find the largest palindrome made from the product of two 3-digit numbers.
    public String solution(String data, String format) {
        startTimer();
        setData(data);

        String result;

        int mn = 0;
        for (int m = 999, n = 999; ; n--){
            mn = m * n;
            if (com.projectEuler.utils.strings.isPalindrome(Integer.toString(mn))) {
                result = Integer.toString(mn);
                break;
            }

            if (n < 900) {
                n = 998;
                m--;
            }
        }

        stopTimer();
        return getResult(format, result);
    }
}
