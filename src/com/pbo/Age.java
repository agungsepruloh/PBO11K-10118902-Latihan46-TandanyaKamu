package com.pbo;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk melakukan pengecekan kondisi kamu berdasarkan umur
 *
 */

import java.util.Scanner;

public class Age {

    private int yearBirth;
    private int yearNow;
    private final String red = "\u001B[31m";

    Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int hitungUmur() {
        return getYearNow() - getYearBirth();
    }

    public String tandanyaKamu(int umur) {
        String sifat;

        sifat = umur <= 5 ? "LAGI LUCU-LUCUNYA" :
                umur <= 10 ? "MASIH ANAK-ANAK" :
                umur <= 13 ? "MASIH REMAJA" :
                umur <= 19 ? "ALAY" :
                umur <= 29 ? "LAGI GALAU NYARI JODOH" :
                umur <= 35 ? "LAGI SIBUK NYARI UANG" :
                umur <= 150 ? "SUDAH TUA" :
                "TIDAK TERDETEKSI DI KEHIDUPAN";

        return red + sifat;
    }

    public static void main(String[] args) {
        Age age = new Age(2019);
        System.out.print("Masukkan tahun lahir anda\t: ");
        Scanner scanner = new Scanner(System.in);
        age.setYearBirth(scanner.nextInt());

        System.out.println("===== Hasil Perhitungan Umur =====");
        System.out.println("Tahun lahir anda\t: " + age.getYearBirth());
        System.out.println("Hari ini tahun\t\t: " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur());
        System.out.println("Tandanya kamu " + age.tandanyaKamu(age.hitungUmur()));
    }
}
