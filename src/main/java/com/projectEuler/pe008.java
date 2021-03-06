package com.projectEuler;

import org.junit.runners.model.InitializationError;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by michael on 2/1/15.
 */
public class pe008 extends peSolution {
    /*
    Largest product in a series
    Problem 8
    The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.

    73167176531330624919225119674426574742355349194934
    96983520312774506326239578318016984801869478851843
    85861560789112949495459501737958331952853208805511
    12540698747158523863050715693290963295227443043557
    66896648950445244523161731856403098711121722383113
    62229893423380308135336276614282806444486645238749
    30358907296290491560440772390713810515859307960866
    70172427121883998797908792274921901699720888093776
    65727333001053367881220235421809751254540594752243
    52584907711670556013604839586446706324415722155397
    53697817977846174064955149290862569321978468622482
    83972241375657056057490261407972968652414535100474
    82166370484403199890008895243450658541227588666881
    16427171479924442928230863465674813919123162824586
    17866458359124566529476545682848912883142607690042
    24219022671055626321111109370544217506941658960408
    07198403850962455444362981230987879927244284909188
    84580156166097919133875499200524063689912560717606
    05886116467109405077541002256983155200055935729725
    71636269561882670428252483600823257530420752963450
    Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
     */

    // set base data and test data
    public pe008() {
        super("PE008", "13,problem008.txt", "4,problem008.txt");
    }

    private static int[] readFileToIntArray(String filename) throws IOException {

        String content;
        int[] intArray;
        content = new String(Files.readAllBytes(Paths.get("src/main/resources/" + filename)));
        content = content.replace("\n", "");
        intArray = new int[content.length()];
        for (int i = 0; i < content.length(); i++) {
            intArray[i] = Integer.parseInt(content.substring(i, i + 1));
        }
        return intArray;

    }


    public String solution(String data, String format) throws InitializationError {
        setData(data);

        int[] testArray;
        long result = 0;
        int n = getArgInt(1);
        String fileName = getArgString(2);

        try {
            testArray = readFileToIntArray(fileName);

            // *** TIMER START ***
            startTimer();


            for (int m = 0; n <= testArray.length; m++, n++) {

                long test = 1;
                for (int i = m; i < n; i++) {
                    test *= testArray[i];
                }

                if (test > result) {
                    result = test;
                }

            }

            // *** TIMER STOP
            stopTimer();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return getResult(format, Long.toString(result));
    }

}
