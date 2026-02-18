package com.mycompany.tugas1pbo;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah uang (Rp) : ");
        int uang = scanner.nextInt();

        System.out.print("Apakah sedang hujan? (true/false) : ");
        boolean hujan = scanner.nextBoolean();

        boolean keluarBeli = (uang > 5000) && (!hujan);
        System.out.println("---------------------------------");
        System.out.println("Keluar beli gorengan? : " + keluarBeli);
        scanner.close();
    }
}