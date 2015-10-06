package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;

/**
 * Created by Guillermo Roldan
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
