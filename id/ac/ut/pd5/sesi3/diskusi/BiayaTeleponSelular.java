package id.ac.ut.pd5.sesi3.diskusi;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class BiayaTeleponSelular {
    public static void hitungTotal(int lamaTelepon) {
        double biayaPerMenit = 1500;
        double totalBiaya = biayaPerMenit * lamaTelepon;
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        System.out.println("Detail biaya telepon:");
        System.out.println("Biaya per menit: " + formatRupiah.format(biayaPerMenit));
        System.out.println("Lama telepon: " + lamaTelepon + " menit");
        System.out.println("Total biaya: " + formatRupiah.format(totalBiaya));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan lama telepon (dalam menit): ");
        int lamaTelepon = input.nextInt();
        hitungTotal(lamaTelepon);
    }
}
