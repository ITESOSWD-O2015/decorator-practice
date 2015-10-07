package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;

/**
 * Created by Paloma on 06/10/2015.
 */
public class Volcan extends Taco {

    public Volcan(String size){
        description = "Volcan";
        super.size=REGULAR;
    }

    @Override
    public double cost(){
        return 12;
    }
}
