package com.iteso.decorator.size;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Feelpaa on 06/10/2015.
 */
public class Mini extends CondimentsDecorator{
    Taco taco;

    public Mini (Taco taco){
        this.taco = taco;
    }



    @Override
    public String getDescription() {
        return taco.getDescription()+"Mini" ;
    }

    @Override
    public double cost() {
        return taco.cost()-1;
    }
}
