package com.iteso.decorator.condiments;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 1:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cebolla extends CondimentsDecorator{
    Taco taco;

    public Cebolla (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con cebolla";
    }

    @Override
    public double cost() {
        return 0 + taco.cost();
    }

    @Override
    public Size getSize() {
        return this.taco.getSize();
    }
}
