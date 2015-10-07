package com.iteso.decorator.meat.moreExpensive;

import com.iteso.decorator.Taco;
import com.iteso.decorator.condiments.moreExpensive.Queso;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Carlos on 06/10/2015.
 */
public class CamaronTest extends TestCase {
    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testGetDescription(){
        Taco camaron = new Camaron(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = camaron.getDescription();
        assertEquals("Taco Normal de camaron", desc);
    }

    @Test
    public void testGetDescriptionWhenError(){
        Taco camaron = new Camaron(taco);
        when(taco.getDescription()).thenReturn("Taco Normal de tamanio mini");
        String desc = camaron.getDescription();
        assertEquals("ERROR", desc);
    }

    @Test
    public void testCost(){
        Taco tacoCamaron = new Camaron(taco);
        when(taco.getDescription()).thenReturn("Taco Normal de camaron");
        when(taco.cost()).thenReturn(8.0);
        double cost = tacoCamaron.cost();
        assertEquals(12.0, cost,0);
    }

    @Test
    public void testCostWhenError(){
        Taco tacoCamaron = new Camaron(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        double cost = tacoCamaron.cost();
        assertEquals(0.0, cost,0);
    }
}