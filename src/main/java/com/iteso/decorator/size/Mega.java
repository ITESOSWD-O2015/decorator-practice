package com.iteso.decorator.size;

import apple.laf.JRSUIConstants;
import com.iteso.decorator.SizeDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by WolfBloodDude on 06/10/15.
 */
public class Mega extends SizeDecorator{
    Taco taco;

    public Mega(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " mega";
    }

    @Override
    public double cost() {
        return 3 + taco.cost();
    }
}
