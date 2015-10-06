package com.iteso.decorator;

import com.sun.glass.ui.Size;

/**
 * Created by JoseFranco on 06/10/2015.
 */
public abstract class TacoSize  {
    public String description = "Any Taco";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
