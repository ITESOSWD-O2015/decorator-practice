package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.Taco;
import com.iteso.decorator.condiments.Cebolla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Aldo on 06/10/2015.
 */
public class CamaronTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco camaron = new Camaron(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = camaron.cost();
        assertEquals(12.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco camaron = new Camaron(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = camaron.getDescription();
        assertEquals("Taco Normal de camaron", desc);
    }

    //////////// MINI TACO
    @Test
    public void testCostSeaFood(){
        Taco camaron = new Camaron(taco);
        when(taco.getMiniSize()).thenReturn(true);
        when(taco.cost()).thenReturn(8.0);
        double cost = camaron.cost();
        assertEquals(-1.0, cost,0);
    }
    @Test
    public void testDescriptionSeaFood(){
        Taco camaron = new Camaron(taco);
        when(taco.getMiniSize()).thenReturn(true);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = camaron.getDescription();
        assertEquals("ERROR - INVALID TACO", desc);
    }
}
