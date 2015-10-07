package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Paloma on 06/10/2015.
 */
public class VolcanTest {
    @Test
    public void testCost() {
        Taco taco = new Volcan("Regular");
        assertEquals(12.0, taco.cost(),0);
    }
}
