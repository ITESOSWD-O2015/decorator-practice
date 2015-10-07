package com.iteso.decorator.condiments.moreExpensive;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 1:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        if(taco.getDescription().contains("ERROR"))
            return "ERROR";
        else
            return taco.getDescription() + " con queso";
    }

    @Override
    public double cost() {
        if(taco.getDescription().contains("ERROR"))
            return 0;
        else
            return 2.00 + taco.cost();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
