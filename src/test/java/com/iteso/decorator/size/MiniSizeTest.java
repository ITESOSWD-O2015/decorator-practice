package com.iteso.decorator.size;

import com.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Aldo on 06/10/2015.
 */
public class MiniSizeTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }


    //////// NOT SEAFOOD MINI TACO
    @Test
    public void testCost(){
        Taco mini = new MiniSize(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = mini.cost();
        assertEquals(6.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco mini = new MiniSize(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = mini.getDescription();
        assertEquals("Taco Normal tamano mini", desc);
    }


    //////////// SEA FOOD MINI TACO
    @Test
    public void testCostSeaFood(){
        Taco mini = new MiniSize(taco);
        when(taco.getSeaMeat()).thenReturn(true);
        when(taco.cost()).thenReturn(8.0);
        double cost = mini.cost();
        assertEquals(-1.0, cost,0);
    }
    @Test
    public void testDescriptionSeaFood(){
        Taco mini = new MiniSize(taco);
        when(taco.getSeaMeat()).thenReturn(true);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = mini.getDescription();
        assertEquals("ERROR - INVALID TACO", desc);
    }
}
