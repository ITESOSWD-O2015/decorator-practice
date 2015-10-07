package com.iteso.decorator.meat.moreExpensive;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Pescado extends CondimentsDecorator {
    Taco taco;

    public Pescado(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        if(taco.getDescription().contains("mini"))
            return "ERROR";
        else if(taco.getDescription().contains("ERROR"))
            return "ERROR";
        else
           return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost() {
        if(taco.getDescription().contains("ERROR"))
            return 0;
        else
            return 3 + taco.cost();
    }
}
