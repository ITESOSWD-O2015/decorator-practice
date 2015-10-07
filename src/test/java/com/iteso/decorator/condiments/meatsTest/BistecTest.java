package com.iteso.decorator.condiments.meatsTest;

import com.iteso.decorator.Taco;
import com.iteso.decorator.condiments.meat.Bistec;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import static org.junit.Assert.assertEquals;
/**
 * Created by Paloma on 06/10/2015.
 */
public class BistecTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = bistec.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco bistec = new Bistec(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = bistec.getDescription();
        assertEquals("Taco Normal de bistec", desc);
    }


}
