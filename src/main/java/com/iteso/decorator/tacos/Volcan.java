package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;

/**
 * Created by Feelpaa on 06/10/2015.
 */
public class Volcan extends Taco {

    public Volcan(){description = "Soy un Volcan Raaawr !";}
    @Override
    public double cost() {
        return 15.00;
    }
}
