package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;
import com.iteso.decorator.condiments.meat.Camaron;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by Aldo on 06/10/2015.
 */
public class QuesadillaTest {

    @Test
    public void testCost() {

        Taco quesadilla = new Quesadilla();
        assertEquals(10.0, quesadilla.cost(),0);
    }
}
