package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;

/**
 * Created by Sacrp on 10/6/15.
 */
public class Volcano extends Taco{

    public Volcano() { description = "Volcano";}

    @Override
    public double cost() {
        return 11.00;
    }
}
