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
public class RegularSizeTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco regular = new RegularSize(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = regular.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco regular = new RegularSize(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = regular.getDescription();
        assertEquals("Taco Normal tamano regular", desc);
    }
}
