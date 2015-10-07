package com.iteso.decorator.condiments;

import com.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/20/13
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class CilantroTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco cilantro = new Cebolla(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getDescription()).thenReturn("Taco Normal");
        double cost = cilantro.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco cilantro = new Cilantro(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = cilantro.getDescription();
        assertEquals("Taco Normal con cilantro", desc);
    }

    @Test
    public void testGetDescriptionWhenError(){
        Taco cilantro = new Cilantro(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        String desc = cilantro.getDescription();
        assertEquals("ERROR", desc);
    }

    @Test
    public void testCostWhenError(){
        Taco cilantro = new Cilantro(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        double cost = cilantro.cost();
        assertEquals(0.0, cost,0);
    }
}

