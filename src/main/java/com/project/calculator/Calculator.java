package com.project.calculator;

public class Calculator {

    public static double calculate(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new IllegalArgumentException("Pembagi tidak boleh nol.");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Operator tidak valid.");
        }
    }
}