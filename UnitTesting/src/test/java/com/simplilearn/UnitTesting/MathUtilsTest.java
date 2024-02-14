package com.simplilearn.UnitTesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathUtilsTest {
    MathUtils mu;

    @Before
    public void setUp() throws Exception {
        mu = new MathUtils();
    }

    @After
    public void tearDown() throws Exception {
        mu = null;
    }

    @Test
    public void testAdd() {
        assertEquals(10, mu.add(2, 8));
        assertEquals(-10, mu.add(2, -12));
    }

    @Test
    public void testSubtract() {
        assertEquals(10, mu.subtract(15, 5));
        assertEquals(-10, mu.subtract(15, 25));
        assertEquals(10, mu.subtract(15, 25));
    }

    @Test
    public void testMultiply() {
        assertEquals(10, mu.multiply(2, 5), 0);
        assertEquals(-10, mu.multiply(2, -5), 0);
    }

    @Test
    public void testDivide() {
        assertEquals(10.5, mu.divide(21, 2), 0);
        assertEquals(-10.5, mu.divide(21, -2), 0);
        assertEquals(-1.0, mu.divide(10, 0), 0); // Division by zero
    }

}
