package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;
/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Quesadilla extends Taco {
    public Quesadilla()
    {
        this.description= "Quesadilla";

    }

    @Override
    public double cost() {
        return 10.00;
    }

    @Override
    public String getDescription() {
        return this.description + " " + this.size;
    }

    @Override
    public Size getSize() {
        return this.size;
    }
}
