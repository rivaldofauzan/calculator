package com.project.calculator;

public class Computation {

    public static String compute(String input1, String input2, String operatorInput) {
        try {
            double operand1 = Double.parseDouble(input1);
            double operand2 = Double.parseDouble(input2);
            char operator = operatorInput.charAt(0);

            if (operand1 < -32768 || operand1 > 32767 || operand2 < -32768 || operand2 > 32767) {
                return "Nilai di luar batas yang diperbolehkan.";
            }

            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                return "Operator tidak valid.";
            }

            double result = Calculate.calculate(operand1, operand2, operator);

            // Check jika hasilnya adalah bilangan bulat atau mengandung desimal
            if (result % 1 == 0) {
                // Jika hasilnya bilangan bulat
                return String.format("Hasil: %d", (int) result);
            } else {
                // Jika hasilnya mengandung desimal, tapi tidak lebih dari 6 digit di belakang koma
                String formatString = result % 1 == 0.0 ? "%.0f" : "%.6f";
                return String.format("Hasil: " + formatString, result);
            }
        } catch (NumberFormatException e) {
            return "Input harus berupa angka.";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}

