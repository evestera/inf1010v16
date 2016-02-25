package mypackage;

import org.junit.Test;

import static org.junit.Assert.*;

import static mypackage.MathUtil.*;

public class MathUtilTest {

    @Test
    public void testAdd() {
        assertEquals(5, add(2, 3));
        assertEquals(-3, add(-4, 1));
        assertEquals(0, add(0, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, multiply(3, 4));
        assertEquals(0, multiply(234, 0));
        assertEquals(-46, multiply(23, -2));
    }

}
