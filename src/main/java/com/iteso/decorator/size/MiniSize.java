package com.iteso.decorator.size;

import com.iteso.decorator.SizeDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Sacrp on 10/6/15.
 */
public class MiniSize extends SizeDecorator{

    Taco taco;

    public MiniSize(Taco taco) { this.taco = taco;}

    @Override
    public String getDescription() {

        return taco.getDescription() + " tamano mini";
    }

    @Override
    public double cost() {
        return taco.cost() - 2;
    }
}
