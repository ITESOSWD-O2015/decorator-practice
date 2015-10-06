package com.iteso.decorator.condiments;

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
        return taco.getDescription() + " con queso";
    }

    @Override
    public double cost() {
        return 2.00 + taco.cost();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Size getSize() {
        return this.taco.getSize();
    }
}
