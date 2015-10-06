package com.iteso.decorator.sizes;

import com.iteso.decorator.TacoSize;

/**
 * Created by GGGK4 on 06/10/2015.
 */
public class RegularSize extends TacoSize {

    public RegularSize(){

        description = "Regular size";
    }
    @Override
    public double cost() {
        return 8.00;
    }
}
