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
        return taco.getDescription() + " tama�o mini";
    }

    @Override
    public double cost() {
        return -3 + taco.cost();
    }
}