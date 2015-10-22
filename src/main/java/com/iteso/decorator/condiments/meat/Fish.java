package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Feelpaa on 06/10/2015.
 *
 *
 * Implementacion del ingrediente fish para los tacos de fish
 */
public class Fish extends CondimentsDecorator {

    Taco taco;


    public Fish (Taco taco){
        this.taco = taco;
    }



    @Override
    public String getDescription() {
        if(taco.getDescription().contains("mini"))
            return "Desfilando Joven no vendemos mini de pescado";
        else
            return taco.getDescription() + " de pescado !!! ";
    }

    @Override
    public double cost() {
        if(taco.getDescription().contains("mini"))
            return 0;
        else
            return 10 + taco.cost();
    }
}
