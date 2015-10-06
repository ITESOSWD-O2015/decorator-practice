package com.iteso.decorator.tacos;
import com.iteso.decorator.Taco;

/**
 * Created by jose luis on 06/10/2015.
 */
public class Volcan extends Taco {

    public Volcan() {

        this.description= "Volcan";

    }

    @Override
    public double cost()
    {
        return 15.00;
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