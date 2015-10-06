package com.iteso.decorator;

/**
 * Created by Guillermo Roldan
 */

public class SizeMini extends SizeDecorator{
    Taco taco;

    public SizeMini(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " tamaño regular";
    }

    @Override
    public double cost() {
        return 0 + taco.cost();
    }
}