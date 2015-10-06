package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Aldo on 06/10/2015.
 */
public class PescadoTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    //////////// NOT MINI TACO
    @Test
    public void testCost(){
        Taco pescado = new Pescado(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = pescado.cost();
        assertEquals(13.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco pescado = new Pescado(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = pescado.getDescription();
        assertEquals("Taco Normal de pescado", desc);
    }

    //////////// MINI TACO
    @Test
    public void testCostSeaFood(){
        Taco pescado = new Pescado(taco);
        when(taco.getMiniSize()).thenReturn(true);
        when(taco.cost()).thenReturn(8.0);
        double cost = pescado.cost();
        assertEquals(-1.0, cost,0);
    }
    @Test
    public void testDescriptionSeaFood(){
        Taco pescado = new Pescado(taco);
        when(taco.getMiniSize()).thenReturn(true);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = pescado.getDescription();
        assertEquals("ERROR - INVALID TACO", desc);
    }
}
