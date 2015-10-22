package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Feelpaa on 06/10/2015.
 *
 *
 * implementacion del ingrediente camraon para los tacos de camaron
 */
public class Shrip extends CondimentsDecorator {

    Taco taco;


    public Shrip (Taco taco){
        this.taco = taco;
    }



    @Override
    public String getDescription() {
        if(taco.getDescription().contains("mini"))
            return "Desfilando Joven no vendemos mini de camaron";
        else
        return taco.getDescription() + " de camaron !!! ";
    }

    @Override
    public double cost() {
        if(taco.getDescription().contains("mini"))
            return 0;
        else
        return 10 + taco.cost();
    }
}
