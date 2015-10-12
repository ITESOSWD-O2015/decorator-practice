package com.iteso.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Taco {
     public String description = "Any Taco";

    public String getDescription(){
        return this.description;
    }
    public abstract double cost();


}
