package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by GGGK4 on 06/10/2015.
 */
public class Pescado extends CondimentsDecorator {

    Taco taco;

    public Pescado(Taco taco){
        this.taco = taco;
    }


    @Override
    public String getDescription() {
       return taco.getDescription() + "de pescado";
    }

    @Override
    public double cost() {
        return 2 + taco.cost();
    }
}
