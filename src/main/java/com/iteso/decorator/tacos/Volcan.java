package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;

/**
 * Created by GGGK4 on 06/10/2015.
 */
public class Volcan extends Taco {

    public Volcan (){

        description = "Volcan";
    }

    @Override
    public double cost() {
        return 15.00;
    }
}
