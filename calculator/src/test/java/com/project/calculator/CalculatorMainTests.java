package com.project.calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorMainTests {

    @Test
    public void testAddition() {
        // TC-001: Testing addition
        String result = Computation.compute("5", "3", "+");
        Assertions.assertEquals("Hasil: 8", result, "Addition test failed");
    }

    @Test
    public void testSubtraction() {
        // TC-002: Testing subtraction
        String result = Computation.compute("8", "3", "-");
        Assertions.assertEquals("Hasil: 5", result, "Subtraction test failed");
    }

    @Test
    public void testMultiplication() {
        // TC-003: Testing multiplication
        String result = Computation.compute("4", "5", "*");
        Assertions.assertEquals("Hasil: 20", result, "Multiplication test failed");
    }

    @Test
    public void testDivision() {
        // TC-004: Testing division
        String result = Computation.compute("15", "3", "/");
        Assertions.assertEquals("Hasil: 5", result, "Division test failed");
    }

    @Test
    public void testDivisionByZero() {
        // TC-005: Testing division by zero
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Computation.compute("10", "0", "/");
        }, "Division by zero should throw an ArithmeticException");
    }
}
