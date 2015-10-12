package com.iteso.decorator.condiments;

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
        return taco.getDescription() + " en tortilla de harina";
    }

    @Override
    public double cost(){
        return 4 + taco.cost();
    }
}
