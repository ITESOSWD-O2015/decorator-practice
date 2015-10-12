package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 11/10/2015.
 */
public class VolcanTest {
    @Test
    public void testCost() {
        Taco taco = new Volcan();
        assertEquals(20.0, taco.cost(),0);
    }
}
