package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Paloma on 06/10/2015.
 */
public class Shrimp extends CondimentsDecorator {
    Taco taco;

    public Shrimp(Taco taco){


            this.taco = taco;


    }

    public String getDescription(){
        if (taco.getDescription().contains("mini"))
            return "Error, no puede haber tacos mini de camaron";
        return this.taco.getDescription() + " de camaron";
    }
    public double cost(){
        if (taco.getDescription().contains("mini")){
        System.out.println("Error, no puede haber tacos mini de camaron");
        return 0;
    }

    else if (taco.getDescription().contains("mega"))
        return 3.00 + taco.cost();


    else
        return 2.0 + taco.cost();

    }
}
