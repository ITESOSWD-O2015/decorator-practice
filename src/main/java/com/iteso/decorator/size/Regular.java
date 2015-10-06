package com.iteso.decorator.size;

import com.iteso.decorator.SizeDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by WolfBloodDude on 06/10/15.
 */
public class Regular extends SizeDecorator{
    Taco taco;

    public Regular(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " regular";
    }

    @Override
    public double cost() {
        return 0 + taco.cost();
    }
}
