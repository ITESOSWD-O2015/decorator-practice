package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;

/**
 * Created by Feelpaa on 06/10/2015.
 */
public class FishTaco extends Taco {
    public FishTaco(){
        description = "Taco Fish D: ";
    }
    @Override
    public double cost() {
        return 15.00 ;
    }
}
