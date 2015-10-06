package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Paloma on 06/10/2015.
 */
public class Fish extends CondimentsDecorator {
    Taco taco;

    public Fish(Taco taco){

        if (!(taco.getDescription().contains("mini")))
            this.taco = taco;

        System.out.print("Error, no puede haber tacos mini de pescado y/o camaron");
    }

    public String getDescription(){
        return this.taco.getDescription() + " de pescado";
    }
    public double cost(){
        return this.cost() + 3;
    }
}
