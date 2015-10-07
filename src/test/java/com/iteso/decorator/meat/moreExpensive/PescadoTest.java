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
public class PescadoTest extends TestCase {
    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testGetDescription(){
        Taco pescado = new Pescado(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = pescado.getDescription();
        assertEquals("Taco Normal de pescado", desc);
    }

    @Test
    public void testGetDescriptionWhenError(){
        Taco pescado = new Pescado(taco);
        when(taco.getDescription()).thenReturn("Taco Normal de tamanio mini");
        String desc = pescado.getDescription();
        assertEquals("ERROR", desc);
    }

    @Test
    public void testCost(){
        Taco pescado = new Pescado(taco);
        when(taco.getDescription()).thenReturn("Taco Normal de pescado");
        when(taco.cost()).thenReturn(8.0);
        double cost = pescado.cost();
        assertEquals(11.0, cost,0);
    }

    @Test
    public void testCostWhenError(){
        Taco pescado = new Pescado(taco);
        when(taco.getDescription()).thenReturn("ERROR");
        when(taco.cost()).thenReturn(8.0);
        double cost = pescado.cost();
        assertEquals(0.0, cost,0);
    }
}