package com.projectEuler.utils;

/**
 * Created by michael on 1/31/15.
 */
public class strings {
    public static boolean isPalindrome(String candidate){
        StringBuilder reversed = new StringBuilder();
        for (int i = candidate.length() - 1; i >= 0; i--) {
            reversed.append(candidate.charAt(i));
        }
        return candidate.contentEquals(reversed);
    }
}
