package com.iteso.decorator.size;

import com.iteso.decorator.Taco;
import com.iteso.decorator.TacoSize;

/**
 * Created by Paloma on 06/10/2015.
 */
public class Normal extends TacoSize {
    Taco taco;

    public Normal(Taco taco){
        this.taco = taco;
    }

    public String getDescription(){
        return taco.getDescription() + "normal";
    }

    public double cost (){
        return taco.cost();
    }
}
