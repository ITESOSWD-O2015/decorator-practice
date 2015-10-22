package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Feelpaa on 15/10/2015.
 */
public class QuesadillaTest {
    @Test
    public void testCost(){
        Taco taco = new Quesadilla();
        assertEquals(10.0, taco.cost(), 0);
    }
}
