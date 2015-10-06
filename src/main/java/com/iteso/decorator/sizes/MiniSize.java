package com.iteso.decorator.sizes;

import com.iteso.decorator.TacoSize;

/**
 * Created by GGGK4 on 06/10/2015.
 */
public class MiniSize extends TacoSize {

    public MiniSize(){

        description = "Mini size";
    }
    @Override
    public double cost() {

        return 6.00;
    }
}
