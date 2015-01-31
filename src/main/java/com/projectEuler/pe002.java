package com.projectEuler;

import java.util.LinkedList;

import static com.projectEuler.utils.fibonacci.getNthTerm;

/**
 * Created by michael on 1/31/15.
 * Tag: data structures, modulus
 */
public class pe002 {

    // Even Fibonacci numbers
    // Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
    // 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    // By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
    // test value: 89 should return 44
    public static String solution(){
        return solution(4000000);
    }

    public static String solution(int max){
        LinkedList<Integer> evenFib = new LinkedList<Integer>();

        int term = 0;
        for (int i = 1; term <= max; i++){
            term = getNthTerm(i);

            // check for max term and if is even
            if (term <= max && term % 2 == 0){
                evenFib.add(term);
            }
        }

        int result = 0;
        for (int i : evenFib){
            result += i;
        }

        return Integer.toString(result);
    }

    public static String test(){
        return solution(89);
    }

}