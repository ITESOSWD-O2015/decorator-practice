package com.iteso.decorator.condiments.meatsTest;

import com.iteso.decorator.Taco;
import com.iteso.decorator.condiments.meat.Fish;
import com.iteso.decorator.condiments.meat.Shrimp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Paloma on 06/10/2015.
 */
public class ShrimpTest {
    private Taco taco;

    @Before
    public  void setUp(){
        taco = mock ((Taco.class));
    }

    @Test
    public void testCost(){
        Taco shrimp = new Shrimp(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getDescription()).thenReturn("Taco regular mega");
        double cost = shrimp.cost();
        assertEquals(11.0,cost,0);
    }

    @Test
    public void testCost2(){
        Taco shrimp = new Shrimp(taco);
        when(taco.cost()).thenReturn(7.0);
        when(taco.getDescription()).thenReturn("Taco regular mini");
        double cost = shrimp.cost();
        assertEquals(0,cost,0);
    }

    @Test
    public void testCost3(){
        Taco shrimp = new Shrimp(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getDescription()).thenReturn("Taco regular");
        double cost = shrimp.cost();
        assertEquals(10,cost,0);
    }

    @Test
    public void testDescription(){
        Taco shrimp = new Shrimp(taco);
        when(taco.getDescription()).thenReturn("Taco regular normal");
        String desc = shrimp.getDescription();
        assertEquals("Taco regular normal de camaron", desc);
    }

    @Test
    public void testDescription2(){
        Taco shrimp = new Shrimp(taco);
        when(taco.getDescription()).thenReturn("Taco regular mini");
        String desc = shrimp.getDescription();
        assertEquals("Error, no puede haber tacos mini de camaron", desc);
    }
}
