package com.iteso.decorator.condiments.moreExpensive;

import com.iteso.decorator.Taco;
import com.iteso.decorator.condiments.Cebolla;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Carlos on 06/10/2015.
 */
public class QuesoTest extends TestCase {
    private Taco taco;

    @Before
    public void setUp(){taco = mock((Taco.class)); }

    @Test
    public void testGetDescription() throws Exception {
        Taco queso = new Queso(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = queso.getDescription();
        assertEquals("Taco Normal con queso", desc);
    }

    @Test
    public void testCost() throws Exception {
        Taco tacoQueso = new Queso(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getDescription()).thenReturn("Taco Normal");
        double cost = tacoQueso.cost();
        assertEquals(10.0, cost,0);
    }

    @Test
    public void testGetDescriptionWhenError(){
        Taco tacoQueso = new Queso(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        String desc = tacoQueso.getDescription();
        assertEquals("ERROR", desc);
    }

    @Test
    public void testCostWhenError(){
        Taco tacoQueso = new Queso(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        double cost = tacoQueso.cost();
        assertEquals(0.0, cost,0);
    }
}