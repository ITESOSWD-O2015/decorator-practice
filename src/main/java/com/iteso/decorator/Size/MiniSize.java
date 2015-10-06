package com.iteso.decorator.Size;

import com.iteso.decorator.Taco;
import com.iteso.decorator.TacoSize;

/**
 * Created by JoseFranco on 06/10/2015.
 */
public class MiniSize extends TacoSize {
    Taco taco;

    public MiniSize(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " Mini Size";
    }

    @Override
    public double cost() {
        return taco.cost() - 2;
    }
}
