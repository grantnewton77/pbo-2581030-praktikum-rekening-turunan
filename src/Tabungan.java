
public class Tabungan extends Rekening {

    // Atribut khusus Tabungan
    private double bungaPersen;

    // Constructor
    public Tabungan(
            String nomor,
            String pemilik,
            int saldo,
            double bungaPersen
    ) {
        super(nomor, pemilik, saldo);

        this.bungaPersen = bungaPersen;
    }

    // Method tambah bunga
    public int tambahBunga() {

        int bunga = (int) Math.round(
                getSaldo() * bungaPersen / 100
        );

        setor(bunga);

        return bunga;
    }

    // Override method cetakInfo
    @Override
    public void cetakInfo() {

        super.cetakInfo();

        System.out.println(
                "     Tabungan, bunga "
                        + bungaPersen + "% per bulan"
        );
    }
}

