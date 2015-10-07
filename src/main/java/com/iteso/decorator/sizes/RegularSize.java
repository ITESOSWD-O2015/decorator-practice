package com.iteso.decorator.sizes;

import com.iteso.decorator.Taco;

/**
 * Created by GGGK4 on 06/10/2015.
 */
public class RegularSize extends Taco {

    Taco taco;

    public RegularSize(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription(){
        return taco.getDescription() + " Taco regular";
    }
    @Override
    public double cost() {

        return 0 + taco.cost();
    }
}
