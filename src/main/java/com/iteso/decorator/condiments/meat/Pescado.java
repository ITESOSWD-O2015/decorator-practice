package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by ShaSkills on 11/10/2015.
 */
public class Pescado extends CondimentsDecorator {

    Taco taco;

    public Pescado(Taco taco){
        this.taco =taco;
    }

    public String getDescription(){
        if(taco.getDescription().contains("mini"))
            return "Error! No vendemos tacos mini de pescado";
        else
        return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost(){

        if(taco.getDescription().contains("mini"))
            return 0;
        else
            return taco.cost() + 20;

    }
}
