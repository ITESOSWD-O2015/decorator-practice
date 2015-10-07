package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Paloma on 06/10/2015.
 */
public class Shrimp extends CondimentsDecorator {
    Taco taco;

    public Shrimp(Taco taco){

        if(taco.getSize()=="Mini"){
            System.out.print("Error, no puede haber tacos mini de pescado y/o camaron");
            return;
        }
        else
            this.taco = taco;


    }

    public String getDescription(){
        return this.taco.getDescription() + " de camaron";
    }
    public double cost(){
        if(taco.getSize()=="Mega"){
            return 3.00 + taco.cost();

        }
        return 2 + taco.cost();
    }
}
