package com.projectEuler.test;

import com.projectEuler.pe007;

import static org.junit.Assert.assertEquals;

public class pe007Test {

    @org.junit.Test
    public void testSolution() throws Exception {

        // test
        assertEquals("PE007: n=6 must be 13", "13", pe007.solution(6));
    }
}