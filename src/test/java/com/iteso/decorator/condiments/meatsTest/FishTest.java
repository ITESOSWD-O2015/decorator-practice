package com.iteso.decorator.condiments.meatsTest;

import com.iteso.decorator.Taco;
import com.iteso.decorator.condiments.meat.Fish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Created by Paloma on 06/10/2015.
 */
public class FishTest {
    private Taco taco;

     @Before
    public  void setUp(){
         taco = mock ((Taco.class));
     }

    @Test
    public void testCost(){
        Taco fish = new Fish(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = fish.cost();
        assertEquals(10.0,cost,0);
    }


    @Test
    public void testDescription(){
        Taco fish = new Fish(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = fish.getDescription();
        assertEquals("Taco Normal de pescado", desc);
    }
}
