package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 1:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Pescado extends CondimentsDecorator {
    Taco taco;
    public String errorS = "ERROR - INVALID TACO";

    public Pescado(Taco taco){
            this.taco = taco;
    }

    public boolean getSeaMeat(){
        return true;
    }

    @Override
    public String getDescription() {

        if(taco.getMiniSize()) return errorS;
        else return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost() {
        if(taco.getMiniSize()) return -1;
        else return 5 + taco.cost();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
