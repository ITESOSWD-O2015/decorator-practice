package com.iteso.decorator.condiments.size;

import com.iteso.decorator.Taco;
import com.iteso.decorator.condiments.sizes.Mega;
import com.iteso.decorator.condiments.sizes.Mini;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ShaSkills on 11/10/2015.
 */
public class MegaTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco mega = new Mega(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getDescription()).thenReturn("mega");
        double cost = mega.cost();
        assertEquals(28.0, cost,0);
    }


    @Test
    public void testDescription(){
        Taco mega = new Mega(taco);
        when(taco.getDescription()).thenReturn("Taco");
        String desc = mega.getDescription();
        assertEquals("Taco mega", desc);
    }
}
