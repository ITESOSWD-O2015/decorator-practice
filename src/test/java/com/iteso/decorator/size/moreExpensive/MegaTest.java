package com.iteso.decorator.size.moreExpensive;

import com.iteso.decorator.Taco;
import com.iteso.decorator.size.cheaper.Mini;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Carlos on 06/10/2015.
 */
public class MegaTest extends TestCase {
    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testGetDescription(){
        Taco mega = new Mega(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = mega.getDescription();
        assertEquals("Taco Normal de tamanio mega", desc);
    }

    @Test
    public void testGetDescriptionWhenError(){
        Taco mega = new Mega(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        String desc = mega.getDescription();
        assertEquals("ERROR", desc);
    }

    @Test
    public void testCost(){
        Taco mega = new Mega(taco);
        when(taco.getDescription()).thenReturn("Taco Normal de tamanio mega");
        when(taco.cost()).thenReturn(8.0);
        double cost = mega.cost();
        assertEquals(16.0, cost,0);
    }

    @Test
    public void testCostWhenError(){
        Taco mega = new Mega(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        when(taco.cost()).thenReturn(8.0);
        double cost = mega.cost();
        assertEquals(0.0, cost,0);
    }
}