package com.project.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorApplicationTests {

	@Test
	public void testAddition() {
		assertEquals(8, Calculator.calculate(5, 3, '+'));
	}

	@Test
	public void testSubtraction() {
		assertEquals(3, Calculator.calculate(7, 4, '-'));
	}

	@Test
	public void testMultiplication() {
		assertEquals(12, Calculator.calculate(6, 2, '*'));
	}

	@Test
	public void testDivision() {
		assertEquals(4, Calculator.calculate(8, 2, '/'));
	}

	@Test
	public void testDivisionByZero() {
		assertEquals("Pembagi tidak boleh nol.", Calculator.calculate(10, 0, '/'));
	}

	@Test
	public void testOutOfRange() {
		assertEquals("Nilai di luar batas yang diperbolehkan.", Calculator.calculate(40000, 30000, '+'));
	}

	@Test
	public void testInvalidOperator() {
		assertEquals("Operator tidak valid.", Calculator.calculate(3, 4, '&'));
	}

	@Test
	public void testNonNumericInput() {
		assertEquals("Input harus berupa angka.", Calculator.calculate(Double.parseDouble("5"), 2, '+'));
	}
	
	@Test
	public void testIntegerResult() {
		assertEquals(5, Calculator.calculate(15, 3, '/'));
	}

	@Test
	public void testDecimalResult() {
		assertEquals(3.333333, Calculator.calculate(10, 3, '/'));
	}
}
