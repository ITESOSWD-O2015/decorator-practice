package com.iteso.decorator.condiments.moreExpensive;

import com.iteso.decorator.Taco;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Carlos on 06/10/2015.
 */
public class TortillaHarinaTest extends TestCase {
    private Taco taco;

    @Before
    public void setUp(){taco = mock((Taco.class)); }

    @Test
    public void testGetDescription(){
        Taco tortillaHarina = new TortillaHarina(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = tortillaHarina.getDescription();
        assertEquals("Taco Normal en tortilla de harina", desc);
    }

    @Test
    public void testCost(){
        Taco tortillaHarina = new TortillaHarina(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getDescription()).thenReturn("Taco Normal");
        double cost = tortillaHarina.cost();
        assertEquals(12.0, cost,0);
    }


    @Test
    public void testGetDescriptionWhenError(){
        Taco tortillaHarina = new TortillaHarina(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        String desc = tortillaHarina.getDescription();
        assertEquals("ERROR", desc);
    }

    @Test
    public void testCostWhenError(){
        Taco tortillaHarina = new TortillaHarina(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        double cost = tortillaHarina.cost();
        assertEquals(0.0, cost,0);
    }
}