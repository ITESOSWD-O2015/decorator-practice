package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;

/**
 * Created by Carlos on 06/10/2015.
 */
public class Volcano extends Taco {
    public Volcano(){
        description = "Volcano";
    }
    @Override
    public double cost() {
        return 10.00;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
