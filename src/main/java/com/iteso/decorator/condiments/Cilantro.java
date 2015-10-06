package com.iteso.decorator.condiments;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 1:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cilantro extends CondimentsDecorator {
    Taco taco;

    public Cilantro (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con cilantro";
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
