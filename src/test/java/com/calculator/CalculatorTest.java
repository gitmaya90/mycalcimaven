package com.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5,calculator.add(3,2));
    }

  
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
    }

    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
    }

    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
    }

    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(1, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Division by zero is not allowed.", e.getMessage());
        }
    }
}
