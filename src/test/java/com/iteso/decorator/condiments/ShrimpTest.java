package com.iteso.decorator.condiments;

import com.iteso.decorator.Taco;
import com.iteso.decorator.size.Mini;
import com.iteso.decorator.condiments.meat.Shrimp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by GeraCruz on 06/10/15.
 */
public class ShrimpTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco shrimp = new Shrimp(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = shrimp.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco shrimp = new Shrimp(taco);
        when(taco.getDescription()).thenReturn("Taco normal");
        String desc = shrimp.getDescription();
        assertEquals("Taco normal de camaron", desc);
    }
    @Test
    public void testDescriptionShrimp(){
        Taco mini = new Mini(taco);
        when(taco.getDescription()).thenReturn(" de camaron");
        String desc = mini.getDescription();
        assertEquals(" de camaron", desc);
    }
}