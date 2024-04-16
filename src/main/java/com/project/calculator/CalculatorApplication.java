package com.project.calculator;

import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        
        // Meminta pengguna untuk memasukkan operand 1
        System.out.print("Masukkan angka pertama: ");
        double operand1 = scanner.nextDouble();

        // Meminta pengguna untuk memasukkan operand 2
        System.out.print("Masukkan angka kedua: ");
        double operand2 = scanner.nextDouble();

        // Meminta pengguna untuk memilih operator
        System.out.print("Pilih operasi (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Memanggil metode compute dari kelas Computation untuk melakukan perhitungan
        String result = Computation.compute(Double.toString(operand1), Double.toString(operand2), Character.toString(operator));
        System.out.println("Hasil: " + result);

        scanner.close();
    }
}
