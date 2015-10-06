package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;
import com.iteso.decorator.size.Regular;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by GeraCruz on 06/10/15.
 */
public class TacoRegularTest {
    private Taco taco;

    @Before
    public void setUp() {
        taco = mock((Taco.class));
    }

    @Test
    public void testCost() {
        Taco reg = new Regular(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = reg.cost();
        assertEquals(8.0, cost, 0);
    }

    @Test
    public void testDescription() {
        Taco reg = new Regular(taco);
        when(taco.getDescription()).thenReturn("");
        String desc = reg.getDescription();
        assertEquals(" Taco regular", desc);
    }
}

