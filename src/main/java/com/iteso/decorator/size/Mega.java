package com.iteso.decorator.size;

import com.iteso.decorator.Taco;
import com.iteso.decorator.TacoSize;

/**
 * Created by Feelpaa on 06/10/2015.
 */
public class Mega extends TacoSize{


    Taco taco;

    public Mega (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getSize() {
        return null;
    }

    @Override
    public double cost() {
        return 0;
    }
}
