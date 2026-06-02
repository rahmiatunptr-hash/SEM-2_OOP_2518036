public class Obat {

    private String kodeObat;
    private String namaObat;
    private String jenisObat;
    private double harga;
    private int stok;

    public Obat(String kodeObat, String namaObat,
            String jenisObat, double harga, int stok) {

        this.kodeObat = kodeObat;
        this.namaObat = namaObat;
        this.jenisObat = jenisObat;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKodeObat() {
        return kodeObat;
    }

    public void setKodeObat(String kodeObat) {
        this.kodeObat = kodeObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public String getJenisObat() {
        return jenisObat;
    }

    public void setJenisObat(String jenisObat) {
        this.jenisObat = jenisObat;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String tampilInfo() {
        return "Kode Obat : " + kodeObat
                + "\nNama Obat : " + namaObat
                + "\nJenis Obat : " + jenisObat
                + "\nHarga : Rp." + harga
                + "\nStok : " + stok;
    }
}