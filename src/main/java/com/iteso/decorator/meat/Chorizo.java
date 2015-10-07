package com.iteso.decorator.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 1:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chorizo extends CondimentsDecorator {
    Taco taco;

    public Chorizo(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        if(taco.getDescription().contains("ERROR"))
            return "ERROR";
        else
            return taco.getDescription() + " de chorizo";
    }

    @Override
    public double cost() {
        if(taco.getDescription().contains("ERROR"))
            return 0;
        else
            return 0 + taco.cost();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
