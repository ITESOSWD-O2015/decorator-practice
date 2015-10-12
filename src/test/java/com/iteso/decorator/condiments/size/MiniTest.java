package com.iteso.decorator.condiments.size;

import com.iteso.decorator.Taco;
import com.iteso.decorator.condiments.Cebolla;
import com.iteso.decorator.condiments.sizes.Mini;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ShaSkills on 11/10/2015.
 */
public class MiniTest {
    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco mini = new Mini(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getDescription()).thenReturn("mini");
        double cost = mini.cost();
        assertEquals(7.0, cost,0);
    }


    @Test
    public void testDescription(){
        Taco mini = new Mini(taco);
        when(taco.getDescription()).thenReturn("Taco");
        String desc = mini.getDescription();
        assertEquals("Taco mini", desc);
    }
}
