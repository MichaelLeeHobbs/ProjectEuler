package com.projectEuler;

import org.junit.runners.model.InitializationError;

/**
 * Created by michael on 1/31/15.
 */
public class peMain {
    static final int PE_SOLUTIONS = 12;

    public static void main(String[] args) throws InitializationError {

        peSolution[] peSolutions = new peSolution[PE_SOLUTIONS];
        peSolutions[0] = new pe001();
        peSolutions[1] = new pe002();
        peSolutions[2] = new pe003();
        peSolutions[3] = new pe004();
        peSolutions[4] = new pe005();
        peSolutions[5] = new pe006();
        peSolutions[6] = new pe007();
        peSolutions[7] = new pe008();
        peSolutions[8] = new pe009();
        peSolutions[9] = new pe010();
        peSolutions[10] = new pe011();
        peSolutions[11] = new pe012();

        for (peSolution pes : peSolutions) {
            System.out.println(pes.test());
            System.out.println(pes.solution());
        }

    }
}
