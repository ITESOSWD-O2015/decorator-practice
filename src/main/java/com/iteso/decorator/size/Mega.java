package com.iteso.decorator.size;

import com.iteso.decorator.Taco;

/**
 * Created by GeraCruz on 06/10/15.
 */
public class Mega extends Taco {
    Taco taco;

    public Mega (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " Taco mega";
    }

    @Override
    public double cost() {
        return 0 + (taco.cost()+3);
    }
}
