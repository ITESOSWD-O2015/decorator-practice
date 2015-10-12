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
public class PastorTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco pastor = new Pastor(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = pastor.cost();
        assertEquals(13.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco pastor = new Pastor(taco);
        when(taco.getDescription()).thenReturn("Taco");
        String desc = pastor.getDescription();
        assertEquals("Taco de pastor", desc);
    }
}
