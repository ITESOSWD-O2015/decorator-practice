package com.iteso.decorator.condiments.meat;

import com.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ShaSkills on 11/10/2015.
 */
public class CamaronTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco camaron = new Camaron(taco);
        when(taco.getDescription()).thenReturn("Taco de camaron");
        when(taco.cost()).thenReturn(8.0);
        double cost = camaron.cost();
        assertEquals(18.0, cost,0);
    }

    @Test
    public void testCostErrorMini(){
        Taco camaron = new Camaron(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getDescription()).thenReturn("Taco mini de camaron");
        double cost = camaron.cost();
        assertEquals(0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco camaron = new Camaron(taco);
        when(taco.getDescription()).thenReturn("Taco");
        String desc = camaron.getDescription();
        assertEquals("Taco de camaron", desc);
    }
}
