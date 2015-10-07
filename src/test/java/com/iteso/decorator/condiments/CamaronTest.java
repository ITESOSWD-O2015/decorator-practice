package com.iteso.decorator.condiments;

import com.iteso.decorator.Taco;
import com.iteso.decorator.condiments.meat.Camaron;
import com.iteso.decorator.condiments.meat.Pescado;
import com.iteso.decorator.sizes.MiniSize;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by GGGK4 on 06/10/2015.
 */
public class CamaronTest {

    private Taco taco;

    @Before
    public void setUp() {
        taco = mock((Taco.class));
    }

    @Test
    public void testCost() {

        Taco camaron = new Camaron(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = camaron.cost();
        assertEquals(8.0, cost, 0);
    }

    @Test
    public void testDescription() {
        Taco camaron = new Camaron(taco);
        when(taco.getDescription()).thenReturn("Taco normal");
        String desc = camaron.getDescription();
        assertEquals("Taco normal de camarón", desc);
    }

    @Test
    public void testDescriptionPescado() {
        Taco mini = new MiniSize(taco);
        when(taco.getDescription()).thenReturn(" de camarón");

    }
}
