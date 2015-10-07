package com.iteso.decorator.size.cheaper;

import com.iteso.decorator.Taco;
import com.iteso.decorator.meat.Pastor;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Carlos on 06/10/2015.
 */
public class MiniTest extends TestCase {
    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testGetDescription(){
        Taco mini = new Mini(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = mini.getDescription();
        assertEquals("Taco Normal de tamanio mini", desc);
    }

    @Test
    public void testGetDescriptionWhenError(){
        Taco mini = new Mini(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        String desc = mini.getDescription();
        assertEquals("ERROR", desc);
    }

    @Test
    public void testCost(){
        Taco mini = new Mini(taco);
        when(taco.getDescription()).thenReturn("Taco Normal de tamanio mini");
        when(taco.cost()).thenReturn(8.0);
        double cost = mini.cost();
        assertEquals(6.0, cost,0);
    }

    @Test
    public void testCostWhenError(){
        Taco mini = new Mini(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        when(taco.cost()).thenReturn(8.0);
        double cost = mini.cost();
        assertEquals(0.0, cost,0);
    }
}