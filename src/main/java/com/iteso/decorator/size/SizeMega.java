package com.iteso.decorator;

/**
 * Created by Guillermo Roldan
 */

public class SizeMega extends SizeDecorator{
    Taco taco;

    public SizeMega(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " tamaño mega";
    }

    @Override
    public double cost() {
        return 5 + taco.cost();
    }
}