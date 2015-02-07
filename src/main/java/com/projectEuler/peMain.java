package com.projectEuler;

import com.projectEuler.utils.MiscMath;
import org.junit.runners.model.InitializationError;

import java.util.ArrayList;

/**
 * Created by michael on 1/31/15.
 */
public class peMain {

    public static void main(String[] args) throws InitializationError {

        String test = MiscMath.numberToBritishString(173l);

        ArrayList<peSolution> peSolutions = new ArrayList<peSolution>();
        peSolutions.add(new pe001());
        peSolutions.add(new pe002());
        peSolutions.add(new pe003());
        peSolutions.add(new pe004());
        peSolutions.add(new pe005());
        peSolutions.add(new pe006());
        peSolutions.add(new pe007());
        peSolutions.add(new pe008());
        peSolutions.add(new pe009());
        peSolutions.add(new pe010());
        peSolutions.add(new pe011());
        peSolutions.add(new pe012());
        peSolutions.add(new pe013());
        peSolutions.add(new pe014());
        peSolutions.add(new pe015());
        peSolutions.add(new pe016());
        peSolutions.add(new PE017());

        for (peSolution pes : peSolutions) {
            System.out.println(pes.test());
            System.out.println(pes.solution());
        }

    }
}

