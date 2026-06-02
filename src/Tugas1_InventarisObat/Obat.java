/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1_InventarisObat;

/**
 *
 * @author Putri
 */
public class Obat {


    // Atribut obat
    private String kodeObat;
    private String namaObat;
    private String jenisObat;
    private double harga;
    private int stok;

    // Constructor untuk inisialisasi data obat
    public Obat(String kodeObat, String namaObat,
                String jenisObat, double harga, int stok) {
        this.kodeObat = kodeObat;
        this.namaObat = namaObat;
        this.jenisObat = jenisObat;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter
    public String getKodeObat() {
        return kodeObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public String getJenisObat() {
        return jenisObat;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Setter stok
    public void setStok(int stok) {
        this.stok = stok;
    }

    // Method untuk menampilkan informasi obat
    public void tampilkanInfo() {
        System.out.println("Kode Obat : " + kodeObat);
        System.out.println("Nama Obat : " + namaObat);
        System.out.println("Jenis Obat : " + jenisObat);
        System.out.println("Harga : Rp" + harga);
        System.out.println("Stok : " + stok + " pcs");
        System.out.println("--------------------------");
    }
}
