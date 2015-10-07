package com.iteso.decorator.condiments.moreExpensive;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 4:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class TortillaHarina extends CondimentsDecorator{
    Taco taco;

    public TortillaHarina(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        if(taco.getDescription().contains("ERROR"))
            return "ERROR";
        else
            return taco.getDescription() + " en tortilla de harina";
    }

    @Override
    public double cost() {
        if(taco.getDescription().contains("ERROR"))
            return 0;
        else
            return 4 + taco.cost();
    }
}
