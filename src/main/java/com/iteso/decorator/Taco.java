package com.iteso.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/19/13
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Taco {

    protected String description;
    protected Size size;

    public abstract double cost();

    public enum Size {
        mini, regular, mega
    }

    //getters and setters
    public abstract String getDescription();
    public abstract Size getSize();


}
