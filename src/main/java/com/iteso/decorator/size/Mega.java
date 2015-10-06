package com.iteso.decorator.size;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Carlos on 06/10/2015.
 */
public class Mega extends CondimentsDecorator {
    Taco taco;

    public Mega(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return (taco.description + " mega size");
    }

    @Override
    public double cost() {
        return (taco.cost() - 2);
    }
}
