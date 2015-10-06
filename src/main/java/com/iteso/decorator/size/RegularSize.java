package com.iteso.decorator.size;

import com.iteso.decorator.SizeDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Sacrp on 10/6/15.
 */
public class RegularSize extends SizeDecorator{

    Taco taco;

    public RegularSize(Taco taco) { this.taco = taco;}

    @Override
    public String getDescription() {

        return taco.getDescription() + " tamano regular";
    }

    @Override
    public double cost() {
        return taco.cost() + 0;
    }
}
