package com.iteso.decorator.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Pastor extends CondimentsDecorator {
    Taco taco;

    public Pastor (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pastor";
    }

    @Override
    public double cost() {
        return 0 + taco.cost();
    }
}
