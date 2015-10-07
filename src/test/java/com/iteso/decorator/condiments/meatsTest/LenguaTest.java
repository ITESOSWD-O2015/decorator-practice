package com.iteso.decorator.condiments.meatsTest;
import com.iteso.decorator.Taco;
import com.iteso.decorator.condiments.meat.Lengua;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Created by Paloma on 06/10/2015.
 */
public class LenguaTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco lengua = new Lengua(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = lengua.cost();
        assertEquals(10.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco lengua = new Lengua(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = lengua.getDescription();
        assertEquals("Taco Normal de lengua", desc);
    }
}
