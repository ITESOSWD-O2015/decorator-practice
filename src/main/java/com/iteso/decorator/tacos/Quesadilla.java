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
    public Quesadilla(String size){

        this.size=size;
        description = "Quesadilla";
    }

    @Override
    public double cost() {
        String size = getSize();
        Double cost = 10.0;
        if(size.equals(MINI)){
            cost-=1;
        }
        else if (size.equals(MEGA)){
            cost+=1;
        }
        return cost;
    }
}
