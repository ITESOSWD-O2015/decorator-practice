package com.iteso.decorator.meat.moreExpensive;

import com.iteso.decorator.Taco;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Carlos on 06/10/2015.
 */
public class LenguaTest extends TestCase {
    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testGetDescription(){
        Taco lengua = new Lengua(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = lengua.getDescription();
        assertEquals("Taco Normal de lengua", desc);
    }

    @Test
    public void testGetDescriptionWhenError(){
        Taco lengua = new Lengua(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        String desc = lengua.getDescription();
        assertEquals("ERROR", desc);
    }

    @Test
    public void testCost(){
        Taco lengua = new Lengua(taco);
        when(taco.getDescription()).thenReturn("Taco Normal de lengua");
        when(taco.cost()).thenReturn(8.0);
        double cost = lengua.cost();
        assertEquals(10.0, cost,0);
    }

    @Test
    public void testCostWhenError(){
        Taco lengua = new Lengua(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        when(taco.cost()).thenReturn(8.0);
        double cost = lengua.cost();
        assertEquals(0.0, cost,0);
    }
}