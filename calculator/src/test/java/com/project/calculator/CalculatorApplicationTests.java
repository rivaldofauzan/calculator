package com.project.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorApplicationTests {

	@Test
	public void testAddition() {
		System.out.println("Running testAddition...");
		double result1 = Calculate.calculate(6, 2, '+');
		System.out.println("Result: " + result1);
		assertEquals(8, result1);

		double result2 = Calculate.calculate(-6, -2, '+');
		System.out.println("Result: " + result2);
		assertEquals(-8, result2);

		double result3 = Calculate.calculate(6, -2, '+');
		System.out.println("Result: " + result3);
		assertEquals(4, result3);

		double result4 = Calculate.calculate(32767, -32768, '+');
		System.out.println("Result: " + result4);
		assertEquals(-1, result4);
	}

	@Test
	public void testSubtraction() {
		System.out.println("Running testSubtraction...");
		double result1 = Calculate.calculate(6, 2, '-');
		System.out.println("Result: " + result1);
		assertEquals(4, result1);

		double result2 = Calculate.calculate(-6, -2, '-');
		System.out.println("Result: " + result2);
		assertEquals(-4, result2);

		double result3 = Calculate.calculate(6, -2, '-');
		System.out.println("Result: " + result3);
		assertEquals(8, result3);

		double result4 = Calculate.calculate(32767, -32768, '-');
		System.out.println("Result: " + result4);
		assertEquals(65535, result4);
	}

	@Test
	public void testMultiplication() {
		System.out.println("Running testMultiplication...");
		double result1 = Calculate.calculate(6, 2, '*');
		System.out.println("Result: " + result1);
		assertEquals(12, result1);

		double result2 = Calculate.calculate(-6, -2, '*');
		System.out.println("Result: " + result2);
		assertEquals(12, result2);

		double result3 = Calculate.calculate(6, -2, '*');
		System.out.println("Result: " + result3);
		assertEquals(-12, result3);

		double result4 = Calculate.calculate(32767, -32768, '*');
		System.out.println("Result: " + result4);
		assertEquals(-1073709056, result4);
	}

	@Test
	public void testDivision() {
		System.out.println("Running testDivision...");
		double result1 = Calculate.calculate(6, 2, '/');
		System.out.println("Result: " + result1);
		assertEquals(3, result1);

		double result2 = Calculate.calculate(-6, -2, '/');
		System.out.println("Result: " + result2);
		assertEquals(3, result2);

		double result3 = Calculate.calculate(6, -2, '/');
		System.out.println("Result: " + result3);
		assertEquals(-3, result3);

		double result4 = Calculate.calculate(32767, -32768, '/');
		System.out.println("Result: " + result4);
		assertEquals(-0.999969482421875, result4);
	}

	@Test
	public void testDivisionByZero() {
		assertEquals("Pembagi tidak boleh nol.", Calculate.calculate(6, 0, '/'));
	}

	@Test
	public void testInvalidOperator() {
		assertEquals("Operator tidak valid.", Calculate.calculate(6, 0, 'a'));
	}
}