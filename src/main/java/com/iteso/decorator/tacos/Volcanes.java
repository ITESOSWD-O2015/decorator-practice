package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;

/**
 * Created by GeraCruz on 06/10/15.
 */
public class Volcanes extends Taco {
    public Volcanes() {
        description = "Volcanes";
    }

    @Override
    public double cost() {
        return 15.00;
    }
}
