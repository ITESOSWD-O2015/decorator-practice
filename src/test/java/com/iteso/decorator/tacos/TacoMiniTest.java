package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;
import com.iteso.decorator.sizes.MiniSize;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by GGGK4 on 06/10/2015.
 */
public class TacoMiniTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco mini = new MiniSize(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = mini.cost();
        assertEquals(5.0, cost,0);
    }
    @Test
    public void testDescription() {
        Taco mini = new MiniSize(taco);
        when(taco.getDescription()).thenReturn("");
        String desc = mini.getDescription();
        assertEquals(" Taco mini", desc);
    }
}
