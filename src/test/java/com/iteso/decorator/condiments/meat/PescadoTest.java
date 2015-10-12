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
public class PescadoTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco pescado = new Pescado(taco);
        when(taco.getDescription()).thenReturn("Taco de pescado");
        when(taco.cost()).thenReturn(8.0);
        double cost = pescado.cost();
        assertEquals(28.0, cost,0);
    }

    @Test
    public void testCostErrorMini(){
        Taco pescado = new Pescado(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getDescription()).thenReturn("Taco mini de pescado");
        double cost = pescado.cost();
        assertEquals(0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco pescado = new Pescado(taco);
        when(taco.getDescription()).thenReturn("Taco");
        String desc = pescado.getDescription();
        assertEquals("Taco de pescado", desc);
    }


}
