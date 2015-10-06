package com.iteso.decorator.Size;

import com.iteso.decorator.Taco;
import com.iteso.decorator.TacoSize;

/**
 * Created by JoseFranco on 06/10/2015.
 */
public class RegularSize extends TacoSize{
        Taco taco;

public RegularSize(Taco taco){
        this.taco = taco;
        }

@Override
public String getDescription() {
        return taco.getDescription() + " Regular Taco";
        }

@Override
public double cost() {
        return taco.cost();
        }
}
