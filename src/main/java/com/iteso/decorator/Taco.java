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
    public abstract double cost();
    public String getDescription(){
        if(description.contains("ERROR"))
            return "Error en el pedido";
        return description;
    }

}
