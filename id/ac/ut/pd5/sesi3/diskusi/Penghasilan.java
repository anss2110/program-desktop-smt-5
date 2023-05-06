package id.ac.ut.pd5.sesi3.diskusi;
import java.text.NumberFormat;
import java.util.Locale;
public class Penghasilan {
    public static double totalPenghasilan(double penghasilanPerJam, int jamKerja, int hariKerja) {
        double totalPenghasilan = penghasilanPerJam * jamKerja * hariKerja;
        return totalPenghasilan;
    }
    public static String formatRupiah(double nilai) {
        Locale localeID = new Locale("id", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        return formatRupiah.format(nilai);
    }
    public static void main(String[] args) {
        double penghasilanPerJam = 200000.0;
        int jamKerja = 9;
        int hariKerja = 22;
        double totalPenghasilan = totalPenghasilan(penghasilanPerJam, jamKerja, hariKerja);
        String formattedTotalPenghasilan = formatRupiah(totalPenghasilan);
        System.out.println("Total penghasilan per bulan: " + formattedTotalPenghasilan);
    }
}
