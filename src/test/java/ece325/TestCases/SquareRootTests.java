package ece325.TestCases;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ece325.*;

/**
 * JUnit test class for solving square roots
 */
public class SquareRootTests {

    // TODO: Assignment 4 Part 2 -- Checkpoint4
    private Calculator calc;
    private double epsilon = 0.0000001;

    @Before 
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @After 
    public void tearDown() throws Exception {
    }

    @Test 
    public void testRandomPositiveSquareRoot() {
        double a = Math.random() * 100000000;
        double res = calc.sqrt(a).doubleValue();
        assertTrue(Math.abs(res*res - a) < epsilon);
    }

    @Test 
    public void testRandomNegitiveSquareRoot() {
        // The result should be a complex number i.e. Double.isNaN()
        double a = Math.random() * -100000000;
        Double res = calc.sqrt(a).doubleValue();
        assertTrue(res.isNaN());
    }

    @Test 
    public void testSquareRootofZero() {
        // You cannot use the Math.sqrt() function in the test!
        double res = calc.sqrt(0).doubleValue();
        assertTrue(Math.abs(res - 0) < epsilon);
    }

    @Test 
    public void testSquareRootofOne() {
        // You cannot use the Math.sqrt() function in the test!
        double res = calc.sqrt(1).doubleValue();
        assertTrue(Math.abs(res - 1) < epsilon);
    }

}
