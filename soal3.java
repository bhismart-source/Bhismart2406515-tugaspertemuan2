package com.mycompany.tugas1pbo;

public class soal3 {
    public static void main(String[] args) {
        char karakter1 = '1';
        char karakter2 = '2';

        int nilaiASCII1 = (int) karakter1;
        int nilaiASCII2 = (int) karakter2;

        int totalASCII = nilaiASCII1 + nilaiASCII2;

        System.out.println("Karakter: '" + karakter1 + "'-->Nilai ASCII = " + nilaiASCII1);
        System.out.println("Karakter: '" + karakter2 + "'-->Nilai ASCII = " + nilaiASCII2);
        System.out.println("---------------------------------");
        System.out.println("Jumlah ASCII('" + karakter1 + "' + '" + karakter2 + "') = "
                           + nilaiASCII1 + " + " + nilaiASCII2 + " = " + totalASCII);
    }
}