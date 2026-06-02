/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Putri
 */
public class ObatSirup extends Obat {



    private int volume;



    public ObatSirup(String kodeObat,

            String namaObat,

            double harga,

            int stok,

            int volume) {



        super(kodeObat, namaObat, "Sirup", harga, stok);

        this.volume = volume;

    }



    public int getVolume() {

        return volume;

    }



    public void setVolume(int volume) {

        this.volume = volume;

    }



    @Override

    public String tampilInfo() {

        return super.tampilInfo()

                + "\nVolume : " + volume + " ml";

    }

}

