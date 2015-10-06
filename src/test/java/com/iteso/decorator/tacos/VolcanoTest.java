package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 06/10/2015.
 */
public class VolcanoTest {
    @Test
    public void testCost() {
        Taco volcano = new Volcano();
        assertEquals(11.0, volcano.cost(),0);
    }
}
