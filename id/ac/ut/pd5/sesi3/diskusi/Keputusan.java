package id.ac.ut.pd5.sesi3.diskusi;

import java.util.Scanner;

public class Keputusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai ujian anda : ");

        int nilaiUjian = input.nextInt();

        if (nilaiUjian >= 80) {
            System.out.println("Nilai anda : " + nilaiUjian + "\nSelamat, nilai ujian anda telah mencapai KKM!");
        } else {
            System.out.println("Nilai anda : " + nilaiUjian + "\nNilai ujian anda belum mencapai KKM, terus tingkatkan prestasi!");
        }
    }
}
