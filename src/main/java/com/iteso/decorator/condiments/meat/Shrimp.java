package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Paloma on 06/10/2015.
 */
public class Shrimp extends CondimentsDecorator {
    Taco taco;

    public Shrimp(Taco taco){

        if (!(taco.getDescription().contains("mini")))
            this.taco = taco;

        System.out.print("Error, no puede haber tacos mini de pescado y/o camaron");
    }

    public String getDescription(){
        return this.getDescription() + " de camaron";
    }
    public double cost(){
        return this.cost() + 5;
    }
}
