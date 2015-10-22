package com.iteso.decorator.size;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Feelpaa on 06/10/2015.
 */
public class Regular extends CondimentsDecorator {


    Taco taco;

    public Regular (Taco taco){
        this.taco = taco;
    }


    @Override
    public double cost() {
        return taco.cost() ;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + "Regular";
    }
}
