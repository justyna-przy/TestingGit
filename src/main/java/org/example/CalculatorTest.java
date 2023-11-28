package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd(){
        assertEquals(4, Calculator.add(2,2));
        assertEquals(10, Calculator.add(8,2));
    }
}
