package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.CondimentsDecorator;
import com.iteso.decorator.Taco;


/**
 * Created by ShaSkills on 11/10/2015.
 */
public class Camaron extends CondimentsDecorator{

    Taco taco;

   public Camaron(Taco taco){
       this.taco = taco;
   }

    @Override
    public String getDescription() {

        if(taco.getDescription().contains("mini"))
            return "Error! No vendemos tacos mini de camaron";
        else
        return taco.getDescription() + " de camaron";
    }


    public double cost(){
          if(taco.getDescription().contains("mini"))
              return 0;
          else
              return taco.cost() + 10;


        }


}
