package id.ac.ut.pd5.sesi5.tugas2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ProgDiskon {
    public static void hitungDiskon (double hargaAsli) {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        double hargaDiskon;
        boolean sudahDiskon = false;
        if (hargaAsli >= 50000.00) {
            hargaDiskon = hargaAsli - ((20 * hargaAsli) / 100);
            sudahDiskon = true;
        } else {
            hargaDiskon = hargaAsli;
        }
        if (sudahDiskon) {
            System.out.println("Selamat, anda mendapatkan diskon 20% !");
        }
        System.out.println("Harga Total : \n" + formatRupiah.format(hargaDiskon));
        System.exit(0);
    }
    public static void main(String[] args) {
        Scanner inputHrgBarang = new Scanner(System.in);

        System.out.print("Masukkan Harga Barang : ");
        double hargaBrgAwal = inputHrgBarang.nextDouble();
        hitungDiskon(hargaBrgAwal);
    }
}
