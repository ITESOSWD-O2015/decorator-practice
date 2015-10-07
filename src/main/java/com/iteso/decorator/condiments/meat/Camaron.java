package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by GGGK4 on 06/10/2015.
 */
public class Camaron extends CondimentsDecorator {

    Taco taco;

    public Camaron(Taco taco){

        this.taco = taco;
    }


    @Override
    public String getDescription() {
        if(taco.getDescription().contains("Taco mini"))
            return taco.getDescription();

        return taco.getDescription() + " de camarón";
    }

    @Override
    public double cost() {
        return 0 + taco.cost();
    }
}
