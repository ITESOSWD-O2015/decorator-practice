package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;

/**
 * Created by ShaSkills on 11/10/2015.
 */
public class Volcan extends Taco {

    public Volcan(){
        description = "Volcan";
    }

    @Override
    public double cost() {
        return 20;
    }
}
