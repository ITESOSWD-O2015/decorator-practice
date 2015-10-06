package com.iteso.decorator.size;

import com.iteso.decorator.Taco;

/**
 * Created by GeraCruz on 06/10/15.
 */
public class Mini extends Taco {
    Taco taco;

    public Mini (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        if (taco.getDescription().contains(" de pescado"))
            return taco.getDescription();
        if (taco.getDescription().contains(" de camaron"))
            return taco.getDescription();
        return taco.getDescription() + " Taco mini";
    }

    @Override
    public double cost(){
        return 0 + (taco.cost()-3);
    }
}
