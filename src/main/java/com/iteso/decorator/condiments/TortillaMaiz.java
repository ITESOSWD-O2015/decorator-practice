package com.iteso.decorator.condiments;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 1:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class TortillaMaiz extends CondimentsDecorator {
    Taco taco;

    public TortillaMaiz (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " en tortilla de maíz";
    }

    @Override
    public double cost() {
        return 0 + taco.cost();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Size getSize() {
        return this.taco.getSize();
    }
}
