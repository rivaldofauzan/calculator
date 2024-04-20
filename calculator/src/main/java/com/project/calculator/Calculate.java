package com.project.calculator;

public class Calculate {

    public static double calculate(double operand1, double operand2, char operator) {
        double hasil = 0 ;
        switch (operator) {
            case '+':
                hasil = operand1 + operand2;
                break;
            case '-':
                hasil = operand1 - operand2;
                break;
            case '*':
                hasil = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    throw new IllegalArgumentException("Pembagi tidak boleh nol.");
                }
                hasil = operand1 / operand2;
                break;
            default:
                throw new IllegalArgumentException("Operator tidak valid.");
        }
        return hasil;
    }
}
