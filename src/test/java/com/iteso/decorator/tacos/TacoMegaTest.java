package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;
import com.iteso.decorator.sizes.MegaSize;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by GGGK4 on 06/10/2015.
 */
public class TacoMegaTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = mock(Taco.class);
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
        when(taco.getDescription()).thenReturn("");
        String desc = mega.getDescription();
        assertEquals(" Taco mega", desc);
    }
}
