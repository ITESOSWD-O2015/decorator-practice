package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by JoseFranco on 06/10/2015.
 */
public class Shrimp extends CondimentsDecorator {
    Taco taco;

    public Shrimp(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de camaron";
    }

    @Override
    public double cost() {
        return 4 + taco.cost();
    }
}
