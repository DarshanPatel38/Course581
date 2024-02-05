import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class MathUtilsTest {
    MathUtils mu;

    @Before
    public void setUp() {
        mu = new MathUtils();
    }

    @After
    public void tearDown() {
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
        assertEquals(-10, mu.subtract(-15, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(10, mu.multiply(2, 5));
        assertEquals(-10, mu.multiply(2, -5));
    }

    @Test
    public void testDivide() {
        assertEquals(10.5, mu.divide(21, 2));
        assertEquals(-10.5, mu.divide(21, -2));
        assertEquals(-1.0, mu.divide(10, 0)); // Division by zero
    }

}