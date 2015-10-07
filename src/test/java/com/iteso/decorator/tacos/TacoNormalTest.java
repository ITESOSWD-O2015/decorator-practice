package com.iteso.decorator.tacos;

import com.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/20/13
 * Time: 10:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class TacoNormalTest {
    @Test
    public void testCost() {
        Taco taco = new TacoNormal("Regular");
        assertEquals(8.0, taco.cost(),0);
    }
}
