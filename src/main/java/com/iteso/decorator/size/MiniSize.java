package com.iteso.decorator.size;

import com.iteso.decorator.SizeDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Sacrp on 10/6/15.
 */
public class MiniSize extends SizeDecorator{

    Taco taco;
    public boolean getMiniSize(){
        return true;
    }
    public String errorS = "ERROR - INVALID TACO";

    public MiniSize(Taco taco) {
        this.taco = taco;
    }

    @Override
    public String getDescription() {

        if(taco.getSeaMeat()) return errorS;
        else return taco.getDescription() + " tamano mini";
    }

    @Override
    public double cost() {

        if(taco.getSeaMeat()) return -1;
        else return taco.cost() - 2;
    }
}
