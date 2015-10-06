package com.iteso.decorator.sizes;

import com.iteso.decorator.TacoSize;

/**
 * Created by GGGK4 on 06/10/2015.
 */
public class MegaSize extends TacoSize {

    public MegaSize(){

        description = "Mega size";
    }
    @Override
    public double cost() {
        return 11.00;
    }
}
