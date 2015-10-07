package com.iteso.decorator.size.cheaper;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;

/**
 * Created by Carlos on 06/10/2015.
 */
public class Mini extends CondimentsDecorator {
    Taco taco;

    public Mini(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        if(taco.getDescription().contains("camaron") || taco.getDescription().contains("pescado"))
            return "ERROR";
        else if(taco.getDescription().contains("ERROR"))
            return "ERROR";
        else
            return (taco.getDescription() + " de tamanio mini");
    }

    @Override
    public double cost() {
        if(taco.getDescription().contains("ERROR"))
            return 0;
        else
            return (taco.cost() - 2);
    }
}
