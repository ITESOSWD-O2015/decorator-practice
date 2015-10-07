package com.iteso.decorator.meat;

import com.iteso.decorator.Taco;
import com.iteso.decorator.meat.moreExpensive.Lengua;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Carlos on 06/10/2015.
 */
public class BistecTest extends TestCase {
    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testGetDescription(){
        Taco bistec = new Bistec(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = bistec.getDescription();
        assertEquals("Taco Normal de bistec", desc);
    }

    @Test
    public void testGetDescriptionWhenError(){
        Taco bistec = new Bistec(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        String desc = bistec.getDescription();
        assertEquals("ERROR", desc);
    }

    @Test
    public void testCost(){
        Taco bistec = new Bistec(taco);
        when(taco.getDescription()).thenReturn("Taco Normal de bistec");
        when(taco.cost()).thenReturn(8.0);
        double cost = bistec.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testCostWhenError(){
        Taco bistec = new Bistec(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        when(taco.cost()).thenReturn(8.0);
        double cost = bistec.cost();
        assertEquals(0.0, cost,0);
    }
}