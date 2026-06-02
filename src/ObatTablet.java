public class ObatTablet extends Obat {

    private String dosis;

    public ObatTablet(String kodeObat,
            String namaObat,
            double harga,
            int stok,
            String dosis) {

        super(kodeObat, namaObat, "Tablet", harga, stok);
        this.dosis = dosis;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    @Override
    public String tampilInfo() {
        return super.tampilInfo()
                + "\nDosis : " + dosis;
    }
}