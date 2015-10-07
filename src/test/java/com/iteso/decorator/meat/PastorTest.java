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
public class PastorTest extends TestCase {
    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testGetDescription(){
        Taco pastor = new Pastor(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = pastor.getDescription();
        assertEquals("Taco Normal de pastor", desc);
    }

    @Test
    public void testGetDescriptionWhenError(){
        Taco pastor = new Pastor(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        String desc = pastor.getDescription();
        assertEquals("ERROR", desc);
    }

    @Test
    public void testCost(){
        Taco pastor = new Pastor(taco);
        when(taco.getDescription()).thenReturn("Taco Normal de pastor");
        when(taco.cost()).thenReturn(8.0);
        double cost = pastor.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testCostWhenError(){
        Taco pastor = new Pastor(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        when(taco.cost()).thenReturn(8.0);
        double cost = pastor.cost();
        assertEquals(0.0, cost,0);
    }
}