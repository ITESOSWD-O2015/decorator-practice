package com.iteso.decorator.condiments;

import com.iteso.decorator.Taco;
import com.iteso.decorator.size.Mini;
import com.iteso.decorator.condiments.meat.Fish;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by GeraCruz on 06/10/15.
 */
public class FishTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco fish = new Fish(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = fish.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco fish = new Fish(taco);
        when(taco.getDescription()).thenReturn("Taco normal");
        String desc = fish.getDescription();
        assertEquals("Taco normal de pescado", desc);
    }
    @Test
    public void testDescriptionFish(){
        Taco mini = new Mini(taco);
        when(taco.getDescription()).thenReturn(" de pescado");
        String desc = mini.getDescription();
        assertEquals(" de pescado", desc);
    }
}
