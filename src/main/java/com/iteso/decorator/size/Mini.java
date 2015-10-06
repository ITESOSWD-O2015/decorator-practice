package com.iteso.decorator.size;

import com.iteso.decorator.SizeDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by WolfBloodDude on 06/10/15.
 */
public class Mini extends SizeDecorator{
    Taco taco;

    public Mini(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " mini";
    }

    @Override
    public double cost() {
        return -2 + taco.cost();
    }
}
