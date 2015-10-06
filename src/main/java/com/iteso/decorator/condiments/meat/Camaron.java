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
public class Camaron extends CondimentsDecorator {
    Taco taco;
    public String errorS = "ERROR - INVALID TACO";

    public boolean getSeaMeat(){ return true; }
    public Camaron(Taco taco){
        if(!taco.getMiniSize() || taco.getIsTaco())
            this.taco = taco;
        else
            System.out.print("Wrong type of taco or neat");
    }

    @Override
    public String getDescription() {
        if(taco.getMiniSize()) return errorS;
        else return taco.getDescription() + " de camaron";
    }

    @Override
    public double cost() {
        if(taco.getMiniSize()) return -1;
        else return 4 + taco.cost();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
