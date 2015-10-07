package com.iteso.decorator.size.moreExpensive;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Carlos on 06/10/2015.
 */
public class Mega extends CondimentsDecorator {
    Taco taco;

    public Mega(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        if(taco.getDescription().contains("ERROR"))
            return "ERROR";
        else
            return (taco.getDescription() + " de tamanio mega");
    }

    @Override
    public double cost() {
        if(taco.getDescription().contains("ERROR"))
            return 0;
        else
            return (taco.cost() + 8);
    }
}
