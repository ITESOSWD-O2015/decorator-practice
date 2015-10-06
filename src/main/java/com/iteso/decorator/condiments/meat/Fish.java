package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by jose luis on 06/10/2015.
 */


public class Fish extends CondimentsDecorator {
    Taco taco;

    public Fish(Taco taco) throws IllegalArgumentException {
        if( taco.getSize()== Size.regular || taco.getSize()== Size.mega)
            this.taco = taco;
        else
            throw new IllegalArgumentException("No that size taco");
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost() {
        return  5 + taco.getSize().ordinal() + taco.cost();
    }

    @Override
    public Size getSize() {
        return this.taco.getSize();
    }

}
