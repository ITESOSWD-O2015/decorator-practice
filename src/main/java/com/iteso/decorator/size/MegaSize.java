package com.iteso.decorator.size;

import com.iteso.decorator.SizeDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Sacrp on 10/6/15.
 */
public class MegaSize extends SizeDecorator{

    Taco taco;

    public MegaSize(Taco taco) { this.taco = taco;}

    @Override
    public String getDescription() {

        return taco.getDescription() + " tamano mega";
    }

    @Override
    public double cost() {
        return taco.cost() + 3;
    }
}
