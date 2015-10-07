package com.iteso.decorator.condiments;

import com.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Paloma on 06/10/2015.
 */
public class TortillaHarinaTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco tortillaharina= new TortillaHarina(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = tortillaharina.cost();
        assertEquals(12.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco tortillaharina = new TortillaHarina(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = tortillaharina.getDescription();
        assertEquals("Taco Normal en tortilla de harina", desc);
    }
}
