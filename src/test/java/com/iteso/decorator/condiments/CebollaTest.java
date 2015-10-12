package com.iteso.decorator.condiments;

import com.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/20/13
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class CebollaTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco cebolla = new Cebolla(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = cebolla.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco cebolla = new Cebolla(taco);
        when(taco.getDescription()).thenReturn("Taco");
        String desc = cebolla.getDescription();
        assertEquals("Taco con cebolla", desc);
    }
}
