package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Guillermo Roldan
 **/

public class Camaron extends CondimentsDecorator {
    Taco taco;

    public Camaron(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de camaron";
    }

    @Override
    public double cost() {
        return 8 + taco.cost();
    }
}