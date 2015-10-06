package com.iteso.decorator.size;

import com.iteso.decorator.SizeDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Sacrp on 10/6/15.
 */
public class MiniSize extends SizeDecorator{

    Taco taco;

    public MiniSize(Taco taco) {

        if(!taco.getSeaMeat())
            this.taco = taco;

        else
            System.out.print("You can't make a mini fish or shrimp taco");
    }

    @Override
    public String getDescription() {

        return taco.getDescription() + " tamano mini";
    }

    public boolean getMiniSize(){
        return true;
    }


    @Override
    public double cost() {
        return taco.cost() - 2;
    }
}
