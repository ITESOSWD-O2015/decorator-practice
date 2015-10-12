package com.iteso.decorator.condiments.sizes;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by ShaSkills on 11/10/2015.
 */
public class Mini extends CondimentsDecorator {
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
        return taco.cost() + -1;
    }
}
