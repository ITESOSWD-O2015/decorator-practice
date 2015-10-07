package com.iteso.decorator.tacos;

import static org.junit.Assert.assertEquals;

import com.iteso.decorator.Taco;
import org.junit.Test;

/**
 * Created by Paloma on 06/10/2015.
 */
public class QuesadillaTest {
    @Test
    public void testCost() {
        Taco taco = new Quesadilla("Regular");
        assertEquals(10.0, taco.cost(),0);
    }
}
