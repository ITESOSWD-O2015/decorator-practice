package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;

/**
 * Created by Feelpaa on 06/10/2015.
 */
public class ShripTaco extends Taco{
    public ShripTaco(){
        description = "Taco Shrip p:";
    }
    @Override
    public double cost() {
        return 18;
    }
}
