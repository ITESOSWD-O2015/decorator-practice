package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ShaSkills on 11/10/2015.
 */
public class LenguaTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco lengua = new Lengua(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = lengua.cost();
        assertEquals(15.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco lengua = new Lengua(taco);
        when(taco.getDescription()).thenReturn("Taco");
        String desc = lengua.getDescription();
        assertEquals("Taco de lengua", desc);
    }

}
