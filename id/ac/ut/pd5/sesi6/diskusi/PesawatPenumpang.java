package id.ac.ut.pd5.sesi6.diskusi;

// Interface untuk komponen pesawat terbang
    interface KomponenPesawat {
    void periksaKeadaan();
}

// Base class untuk pesawat terbang
class Pesawat {
    protected String nama;

    public Pesawat(String nama) {
        this.nama = nama;
    }

    public void terbang() {
        System.out.println(nama + " sedang terbang.");
    }

    public void mendarat() {
        System.out.println(nama + " sedang mendarat.");
    }
}

// Subclass untuk sayap pesawat
class Sayap implements KomponenPesawat {
    public void periksaKeadaan() {
        System.out.println("Sayap pesawat dalam keadaan baik.");
    }
}

// Subclass untuk mesin pesawat
class Mesin implements KomponenPesawat {
    public void periksaKeadaan() {
        System.out.println("Mesin pesawat dalam keadaan baik.");
    }
}

// Subclass untuk kabin pesawat
class Kabin implements KomponenPesawat {
    public void periksaKeadaan() {
        System.out.println("Kabin pesawat dalam keadaan baik.");
    }
}

// Main class untuk menjalankan program
public class PesawatPenumpang {
    public static void main(String[] args) {
        Pesawat pesawat = new Pesawat("Airbus A320");

        Sayap sayap = new Sayap();
        sayap.periksaKeadaan();

        Mesin mesin = new Mesin();
        mesin.periksaKeadaan();

        Kabin kabin = new Kabin();
        kabin.periksaKeadaan();

        System.out.println("");

        pesawat.terbang();
        pesawat.mendarat();
    }
}
