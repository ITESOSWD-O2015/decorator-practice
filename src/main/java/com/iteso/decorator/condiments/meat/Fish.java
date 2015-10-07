package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Paloma on 06/10/2015.
 */
public class Fish extends CondimentsDecorator {
    Taco taco;

    public Fish(Taco taco){

        if (taco.getSize()=="Mini"){//((taco.getDescription().contains("Mini"))) {
            System.out.print("Error, no puede haber tacos mini de pescado y/o camaron");
            return;
        }

        else
        this.taco = taco;
    }

    @Override
    public String getDescription(){
        return this.taco.getDescription() + " de pescado";
    }
    @Override
    public double cost(){
        if(taco.getSize()=="Mini"){//(taco.description.contains("Mega")){
            return 3.00 + taco.cost();
        }

        return 2.0 + taco.cost();

    }
}
