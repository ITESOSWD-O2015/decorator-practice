package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.Taco;
import com.iteso.decorator.CondimentsDecorator;

/**
 * Created by GeraCruz on 06/10/15.
 */
public class Fish extends CondimentsDecorator {
    Taco taco;

    public Fish (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        if (taco.getDescription().contains(" taco mini"))
            return taco.getDescription();
        return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost() {
        return 0 + taco.cost();
    }
}