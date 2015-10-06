package com.iteso.decorator.size;

import com.iteso.decorator.Taco;
import com.iteso.decorator.TacoSize;

/**
 * Created by Paloma on 06/10/2015.
 */
public class Mini extends TacoSize {
    Taco taco;



    public Mini(Taco taco){

            if (!(taco.getDescription().contains("con pescado") || taco.getDescription().contains("con camaron")))
                this.taco = taco;

            System.out.print("Error, no puede haber tacos mini de pescado y/o camaron");

    }

    public String getDescription(){
        return taco.getDescription() + "mini";
    }

    public double cost (){
        return taco.cost() - 2;
    }
}
