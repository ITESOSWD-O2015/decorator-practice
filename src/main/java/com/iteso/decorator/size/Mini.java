package com.iteso.decorator.size;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Carlos on 06/10/2015.
 */
public class Mini extends CondimentsDecorator {
    Taco taco;

    public Mini(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return (taco.description + " mini size");
    }

    @Override
    public double cost() {
        return (taco.cost() - 2);
    }
}
