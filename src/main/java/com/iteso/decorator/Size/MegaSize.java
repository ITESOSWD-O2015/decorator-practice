package com.iteso.decorator.Size;

import com.iteso.decorator.Taco;
import com.iteso.decorator.TacoSize;

/**
 * Created by JoseFranco on 06/10/2015.
 */
public class MegaSize extends TacoSize {
    Taco taco;

    public MegaSize(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " Mega Taco";
    }

    @Override
    public double cost() {
        return 4 + taco.cost();
    }
}
