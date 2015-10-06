package com.iteso.decorator.size;

import com.iteso.decorator.Taco;
import com.iteso.decorator.condiments.Cilantro;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Aldo on 06/10/2015.
 */
public class MegaSizeTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco mega = new MegaSize(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = mega.cost();
        assertEquals(11.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco mega = new MegaSize(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = mega.getDescription();
        assertEquals("Taco Normal tamano mega", desc);
    }
}
