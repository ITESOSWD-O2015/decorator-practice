package com.iteso.decorator.sizes;

import com.iteso.decorator.Taco;

/**
 * Created by GGGK4 on 06/10/2015.
 */
public class MiniSize extends Taco {

    Taco taco;

    public MiniSize(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription(){
        return taco.getDescription() + " Taco mini";
    }
    @Override
    public double cost() {

        return 0 + (taco.cost()-3);
    }
}
