package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;

/**
 * Created by WolfBloodDude on 06/10/15.
 */
public class Volcanoes extends Taco{
    public Volcanoes(){
        description = "Volcán";
    }
    @Override
    public double cost() {
        return 12.00;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
