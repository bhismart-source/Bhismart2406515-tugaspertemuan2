package com.mycompany.tugas1pbo;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int b = scanner.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        int c = scanner.nextInt();

        int hasilTambah = a + b + c;
        int hasilKurang = a - b - c;
        int hasilKali   = a * b * c;
        double hasilBagi = (double) a / b / c;

        System.out.println("\nHASIL OPERASI");
        System.out.println("Penjumlahan : " + a + " + " + b + " + " + c + " = " + hasilTambah);
        System.out.println("Pengurangan : " + a + " - " + b + " - " + c + " = " + hasilKurang);
        System.out.println("Perkalian   : " + a + " * " + b + " * " + c + " = " + hasilKali);
        System.out.printf ("Pembagian   : %d / %d / %d = %.2f%n", a, b, c, hasilBagi);
        scanner.close();
    }
}