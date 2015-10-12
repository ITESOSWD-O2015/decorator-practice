package com.iteso.decorator.condiments;

import com.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ShaSkills on 11/10/2015.
 */
public class TortillaMaizTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco tortillamaiz = new TortillaMaiz(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = tortillamaiz.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco tortillamaiz = new TortillaMaiz(taco);
        when(taco.getDescription()).thenReturn("Taco");
        String desc = tortillamaiz.getDescription();
        assertEquals("Taco en tortilla de maiz", desc);
    }
}
